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
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {
        int bestmove = 0;
        for (int i = 0; i < ladders.length; i++) {
            for (int j = 0; j < ladders[i].length; j++) {
                int move = ladders[i][j];
                if(bestmove  < boardsize - move);
                    bestmove = move;
            }
        }
        return 0;
    }
}
