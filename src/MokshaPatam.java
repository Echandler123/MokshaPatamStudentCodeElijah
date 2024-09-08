import java.util.LinkedList;
import java.util.Queue;

/**
 * Moksha Patam
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 *
 * Completed by: [YOUR NAME HERE]
 *
 */

public class MokshaPatam {

    /**
     * TODO: Complete this function, fewestMoves(), to return the minimum number of moves
     *  to reach the final square on a board with the given size, ladders, and snakes.
     */
    public int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {
        Queue<Integer> myQueue = new LinkedList<Integer>();
        int[] map = new int[boardsize];
        int start = 0;
        int rollnum = 0;
        boolean[] isVisited = new boolean[boardsize];
        for (int i = 0; i < boardsize; i++) {
            if (i == ladders[start][0]) {
                map[i] = ladders[start][1] - 1;
                if (i == snakes[start][0]) {
                    map[i] = snakes[start][1] - 1;
                }
            }
            else {
                map[i] = i;
            }
        }
        while (myQueue.size() > 0) {
            int currentNode = myQueue.remove();
            if (currentNode == boardsize - 1){
                return rollnum;
            }
            for (int i = 0; i < 6; i++) {
                int node = map[currentNode + i];
                if (isVisited[node + i] == false) {
                    isVisited[node + i] = true;
                }
            }
            rollnum++;
        }
        return -1;
    }
}


