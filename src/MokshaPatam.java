import java.util.LinkedList;
import java.util.Queue;

/**
 * Moksha Patam
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 *
 * Completed by: Elijah Chandler
 *
 */

public class MokshaPatam {

    /**
     * TODO: Complete this function, fewestMoves(), to return the minimum number of moves
     *  to reach the final square on a board with the given size, ladders, and snakes.
     */
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {
        // Initialize my queue to hold the nodes, the array to check if nodes were visited
        // and initialize the map of snakes, ladders, and nodes.
        Queue<Integer> myQueue = new LinkedList<>();
        int[] map = new int[boardsize];
        int rollnum = 0;
        boolean[] isVisited = new boolean[boardsize];
        // Add the ladders to the map
        for (int i = 0; i < ladders.length; i++) {
                map[ladders[i][0]] = ladders[i][1] - 1;
        }
        // Add the snakes to the map
        for (int i = 0; i < snakes.length; i++) {
                map[snakes[i][0]] = snakes[i][1] - 1;
        }
        // Add the regular squares to the map
        for (int i = 0; i < boardsize; i++) {
            if(map[i] == 0){
                map[i] = i;
            }
        }
        myQueue.add(0);
        // BFS to find the fewest number of squares
        while (myQueue.size() > 0) {
            int Size = myQueue.size();
            for(int j = 0; j < Size; j++) {
                // Remove the node that you are at from the queue
                int currentNode = myQueue.remove();
                // Check if the current node is the final one on the board the return the number of rolls it took to
                // get there
                if (currentNode + 1 == boardsize) {
                    return rollnum;
                }
                // For loop to simulate rolling six sided dice
                for (int i = 1; i <= 6; i++) {
                    // Add the node you are moving to if the node has not been visited then set that node as visited
                    if (currentNode + i < boardsize && isVisited[currentNode + i - 1] == false) {
                        myQueue.add(map[currentNode + i]);
                        isVisited[currentNode + i - 1] = true;
                    }
                }
            }
            rollnum++;
        }
        return -1;
    }
}


