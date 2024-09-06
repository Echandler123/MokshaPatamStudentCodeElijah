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
        int moves = 0;
        Queue<Integer> myQueue = new LinkedList<Integer>();
        int rolls = 0;
        int num = 1;
        int[] map = new int[boardsize];
        int start = 0;
        int rollnum = 0;
        for(int i = 0; i < boardsize;i++) {
            if(i == ladders[start][0] || i == snakes[start][start]);{
                map[i] = ladders[start][start];
            }
        }
        while(myQueue.size() > 0) {
            int currentnode = myQueue.remove();
            if(currentnode == boardsize);{
                return rollnum;
            }
            for(int i =0; i < 6; i++) {
                int node = map[currentnode+i];
                if(){
                    rollnum++;
                }

            }







        }
        return 0;
    }

}
