// 2. second class in tree Package
package tree;

import java.util.Scanner;

public class BinaryTreeUse {

    public static void printTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data +" ");
        printTree(root.left);
        printTree(root.right);
    }

    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data : ");
        } else {
            if (isLeft) {
                System.out.println("Enter left child of "+parentData);
            } else {
                System.out.println("Enter right child of "+parentData);
            }
        }

        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData,true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    public static BinaryTreeNode<Integer> takeTreeInput() {
        System.out.println("Enter root data : ");
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput();
        BinaryTreeNode<Integer> rightChild = takeTreeInput();
        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data +" : ");
        if (root.left != null) {
            System.out.print("L"+root.left.data+ " , ");
        }
        if (root.right != null) {
            System.out.print("R"+root.right.data);
        }
        System.out.println();

        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }

    public static int countNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return 1 + leftCount + rightCount;
    }

    public static int NodesSum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftSum = NodesSum(root.left);
        int rightSum = NodesSum(root.right);
        return root.data + leftSum + rightSum;
    }

    public static int largest(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        int largestLeft = largest(root.left);
        int largestRight = largest(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }

    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int X) {
        if (root == null) {
            return 0;
        }
        int count = (root.data > X)?1:0;

        if (root.left != null) {
            count += countNodesGreaterThanX(root.left, X);
        }

        if (root.right != null) {
            count += countNodesGreaterThanX(root.right, X);
        }
        return count;
    }

    public static int heightOfTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int heightLeft = heightOfTree(root.left);
        int heightRight = heightOfTree(root.right);

        return 1 + Math.max(heightLeft , heightRight);
    }

    public static int NoOfLeafNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }
        return NoOfLeafNodes(root.left) + NoOfLeafNodes(root.right);
    }

    public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
        if (root == null) {
            return;
        }

        if (k == 0) {
            System.out.println(root.data);
            return;
        }

        printAtDepthK(root.left, k - 1);
        printAtDepthK(root.right, k - 1);
    }

    public static void changeToTreeDepthHelper(BinaryTreeNode<Integer> root, int depth) {
        if (root == null) {
            return;
        }

        root.data = depth;
        changeToTreeDepthHelper(root.left, depth + 1);
        changeToTreeDepthHelper(root.right, depth + 1);
    }

    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
//        root.left = rootLeft;
//        root.right = rootRight;
//
//        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
//        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);
//        rootLeft.right = twoRight;
//        rootRight.left = threeLeft;
//
//        //printTree(root);
        BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        //printTreeDetailed(root);
        //System.out.println("Numbers of Nodes = "+countNodes(root));
        //System.out.println("Sum of Nodes = "+NodesSum(root));
        //System.out.printf("Largest = "+largest(root));
        //System.out.printf("Count Greater than X = " +countNodesGreaterThanX(root, 5));
        //System.out.printf("Height of Tree is "+heightOfTree(root));
        //System.out.printf("Number of Leaf Nodes = "+NoOfLeafNodes(root));
        //printAtDepthK(root, 2);
        changeToTreeDepthHelper(root, 0);
        //printTreeDetailed(root); //changeToTreeDepthHelper check krne ke liye

    }
}
