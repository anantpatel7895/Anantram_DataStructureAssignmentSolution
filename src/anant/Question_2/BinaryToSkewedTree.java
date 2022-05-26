package anant.Question_2;

import anant.Question_2.TreeDriver.Node;

public class BinaryToSkewedTree {

        static Node preNode = null;
        static Node headNode = null;


        public Node skewedTree(Node root, int val) {

            if (root == null) {
                return null;
            }

            if (val > 0) {
                skewedTree(root.right, val);
            }else {
                skewedTree(root.left, val);
            }
            Node rightNode = root.right;
            Node leftNode = root.left;


            if (headNode == null) {
                headNode = root;
                root.left = null;
                preNode = root;
            }else {
                preNode.right = root;
                root.left = null;
                preNode = root;
            }

            if (val > 0) {
                skewedTree(leftNode, val);
            }else {
                skewedTree(rightNode, val);
            }
            return headNode;
        }

        public void traverseRightSkewed(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.val + " ");
            traverseRightSkewed(root.right);
        }
}
