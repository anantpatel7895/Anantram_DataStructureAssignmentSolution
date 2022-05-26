package anant.Question_2;

public class TreeDriver {

    public static Node node;

    static class Node {
        int val;
        Node left, right;

        Node(int item) {
            val = item;
            left = right = null;
        }

        public static void main(String[] args) {

            node = new Node(50);
            node.left = new Node(30);
            node.right = new Node(60);
            node.left.left = new Node(10);
            node.right.left = new Node(55);
            int val = 0;
            BinaryToSkewedTree main = new BinaryToSkewedTree();
            Node headNode = main.skewedTree(node, val);
            main.traverseRightSkewed(headNode);
        }
    }
}
