package data_structures.trees;

public class BinaryTree {

    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data; // Using int, but can use generic

        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public BinaryTree(){
        this.root = null;
    }

    // INCOMPLETE
    public void insert(int value){
        TreeNode node = new TreeNode(value);
        if (root == null){
            this.root = node;
        }
        else{
            TreeNode currentNode = this.root;
            while (currentNode != null){
                if (node.data > currentNode.data){
                    currentNode = currentNode.right;
                }
                else if (node.data < currentNode.data){
                    currentNode = currentNode.left;
                }
            }
        }
    }

    // Returns the number of searches performed.
    //INCOMPLETE
    public int search(int value){
        int counter = 0;
        TreeNode current = root;
        while (current != null){
            if (value >= current.data){
                current = current.right;
                counter++;
            }
            else{
                current = current.left;
                counter++;
            }
            System.out.println("step");
        }
        return counter;
    }


}
