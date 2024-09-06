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
        Node nodeone = new Node();
        Queue<Node> myQueue = new LinkedList<Node>();
        myQueue.add(nodeone);
        int num = 1;
        for(int i = 1; i < boardsize;i++);{
            num++;
            myQueue.add(new Node(num));
        }
        while(myQueue.size() > 0){
            moves ++;
            Node Currentnode = myQueue.remove();
            if(Currentnode.getNodeup().visited == false){
                myQueue.add(Currentnode.getNodeup());
            }
            if(Currentnode.getNodedown().visited == false){
                myQueue.add(Currentnode.getNodedown());
            }
            if(Currentnode.getVal() == boardsize);{
                return moves;
            }
        }
        return 0;
    }
    public class Node{
        private int val;
        private Node nodeup;
        private Node nodedown;
        private boolean visited;
        public Node(){
            val = 1;
        }
        public Node(int val){
            this.val = val;
        }

        public void setNodedown(Node nodedown) {
            this.nodedown = nodedown;
        }

        public void setNodeup(Node nodeup) {
            this.nodeup = nodeup;
        }

        public Node getNodedown() {
            return nodedown;
        }

        public Node getNodeup() {
            return nodeup;
        }

        public int getVal() {
            return val;
        }



        public boolean isVisited() {
            return visited;
        }
    }
}
