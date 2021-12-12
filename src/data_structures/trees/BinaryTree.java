package data_structures.trees;

public class BinaryTree {

    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data; // Using int, but can use generic

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first; // Root points to the first node
        // second (left) <--------- first ----------> third (right)
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;
    }
}
