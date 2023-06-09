//Apna College
package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeB {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTreeApna{
        static int idx = -1; //idx = index
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                //System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                //System.out.print("-1 ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                //System.out.print("-1 ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        //Level wise traversal
        public static void printLevelWise(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currentNode = q.poll();
                if (currentNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currentNode.data+" ");
                    if (currentNode.left != null) {
                        q.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        q.add(currentNode.right);
                    }
                }
            }
        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return (1 + Math.max(leftHeight, rightHeight));
        }

        public static int CountOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int countLeftNodes = CountOfNodes(root.left);
            int countRightNodes = CountOfNodes(root.right);

            return 1 + countLeftNodes + countLeftNodes;
        }

        public static int SumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int countLeftNodes = SumOfNodes(root.left);
            int countRightNodes = SumOfNodes(root.right);

            return root.data + countLeftNodes + countLeftNodes;
        }


    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTreeApna tree = new BinaryTreeApna();
        Node root = tree.buildTree(nodes);

        //tree.preorder(root);
        //tree.inorder(root);
        //tree.postorder(root);
        //tree.printLevelWise(root);
        //System.out.println(tree.height(root));
        //System.out.println(tree.CountOfNodes(root));
        System.out.println(tree.SumOfNodes(root));


    }
}
