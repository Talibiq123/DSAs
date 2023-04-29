// 2. second class in tree Package
package tree;

import java.util.LinkedList;
import java.util.Queue;
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
    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            return null;
        }

        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);

        return root;
    }


    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);

        BinaryTreeNode<Integer> tenpLeft = root.left;
        root.left = root.right;
        root.right = tenpLeft;
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        Boolean isLeftBalanced = isBalanced(root.left);
        Boolean isRightBalanced = isBalanced(root.right);

        return (isLeftBalanced && isRightBalanced);
    }

    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            int height = 0;
            boolean isBal = true;
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = height;
            ans.isBalanced = isBal;
            return ans;
        }

        BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
        BalancedTreeReturn rightOutput = isBalancedBetter(root.right);

        boolean isBal = true;
        int height =1 + Math.max(leftOutput.height, rightOutput.height);

        if (Math.abs(leftOutput.height - rightOutput.height) > 1) {
            isBal = false;
        }

        if (!leftOutput.isBalanced || !rightOutput.isBalanced) {
            isBal = false;
        }

        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.height = height;
        ans.isBalanced = isBal;
        return ans;
    }

    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int option1 = heightOfTree(root.left) + heightOfTree(root.right);
        int options2 = heightOfTree(root.left);
        int options3 = heightOfTree(root.right);

        return Math.max(option1, Math.max(options2, options3));
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChildren.add(root);

        while (!pendingChildren.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.println("Enter left child of "+front.data);
            int left = sc.nextInt();
            if (left != -1) {
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(left);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }

            System.out.println("Enter right child of "+front.data);
            int right = sc.nextInt();
            if (right != -1) {
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(right);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }

        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> pendingQueue = new LinkedList<>();
        pendingQueue.add(root);

        while (!pendingQueue.isEmpty()) {
            BinaryTreeNode<Integer> frontNode = pendingQueue.poll();

            if (frontNode == null) {
                System.out.println();

                if (!pendingQueue.isEmpty()) {
                    pendingQueue.add(null);
                }
            } else {
                System.out.print(frontNode.data + " -> L:");

                if (frontNode.left != null) {
                    pendingQueue.add(frontNode.left);
                    System.out.print(frontNode.left.data + ", R:");
                } else {
                    System.out.print("-1, R:");
                }
                if (frontNode.right != null) {
                    pendingQueue.add(frontNode.right);
                    System.out.println(frontNode.right.data);
                } else {
                    System.out.println("-1");
                }
            }

        }
    }

    public static BinaryTreeNode<Integer> buildTreeFromPreInHelper(int[] pre, int[] in, int siPre, int eiPre, int siIn, int eiIn) {
        if (siPre > eiPre) {
            return null;
        }
        int rootData = pre[siPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        int rootIndex = -1;
        for (int i = siIn; i <= eiIn; i++) {
            if (in[i] == rootData) {
                rootIndex = i;
                break;
            }
        }

        //I am assuming that root is actually present in inorder
        int siPreLeft = siPre + 1;
        int siInLeft = siIn;
        int eiInLeft = rootIndex - 1;
        int siInRight = rootIndex + 1;
        int eiPreRight = eiPre;
        int eiInRight = eiIn;

        int leftSubtreeLength = eiInLeft - siInLeft + 1;

        int eiPreLeft = siPreLeft + leftSubtreeLength - 1;
        int siPreRight = eiPreLeft + 1;

        BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
        BinaryTreeNode<Integer> right = buildTreeFromPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);
        root.left = left;
        root.right = right;
        return root;
    }

    public static BinaryTreeNode<Integer> buildTreeFromInPre(int[] pre, int[] in) {
        BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(pre, in, 0, pre.length - 1, 0, in.length - 1);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTreeHelper(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd) {
        if (postStart > postEnd || inStart > inEnd) {
            return null;
        }

        int rootVal = postOrder[postEnd];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootVal);

        //Find parent element index from inorder array
        int k = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inOrder[i] == rootVal) {
                k = i;
                break;
            }
        }
        root.left = buildTreeHelper(postOrder, postStart, postStart + k - 1, inOrder, inStart, k - 1);
        root.right = buildTreeHelper(postOrder, postStart + k - inStart, postEnd - 1, inOrder, k + 1, inEnd);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int[] inOrder, int[] postOrder) {
        int n = postOrder.length;

        int postStart = 0;
        int postEnd = n - 1;
        int inStart = 0;
        int inEnd = n - 1;

        return buildTreeHelper(postOrder, postStart, postEnd, inOrder, inStart, inEnd);
    }

    public static void insertDuplicateNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(root.data);
        BinaryTreeNode<Integer> rootLeft = root.left;
        root.left = newNode;
        newNode.left = rootLeft;

        insertDuplicateNodes(rootLeft);
        insertDuplicateNodes(root.right);

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
        //BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        //printTreeDetailed(root);
        //System.out.println("Numbers of Nodes = "+countNodes(root));
        //System.out.println("Sum of Nodes = "+NodesSum(root));
        //System.out.printf("Largest = "+largest(root));
        //System.out.printf("Count Greater than X = " +countNodesGreaterThanX(root, 5));
        //System.out.printf("Height of Tree is "+heightOfTree(root));
        //System.out.printf("Number of Leaf Nodes = "+NoOfLeafNodes(root));
        //printAtDepthK(root, 2);
        //changeToTreeDepthHelper(root, 0);
        //printTreeDetailed(root); //changeToTreeDepthHelper check krne ke liye
        //BinaryTreeNode<Integer> nwwRoot = removeLeaves(root);
        //printTreeDetailed(nwwRoot);
        //mirrorBinaryTree(root);

        //System.out.println(isBalanced(root));
        //System.out.println("is Balance "+isBalancedBetter(root).isBalanced);

        //System.out.println("Diameter is "+diameterOfBinaryTree(root));

        BinaryTreeNode<Integer> root = takeInputLevelWise();
        //printTreeDetailed(root);
        //printLevelWise(root);

        //int[] in = {4, 2, 5, 1, 3};
        //int[] pre = {1, 2, 4, 5, 3};
        //int[] post = {4, 5, 2, 3, 1};
        //BinaryTreeNode<Integer> root = buildTreeFromInPre(pre, in);
        //BinaryTreeNode<Integer> root = buildTree(in, post);
        //printTreeDetailed(root);

        insertDuplicateNodes(root);
        printLevelWise(root);

    }
}
