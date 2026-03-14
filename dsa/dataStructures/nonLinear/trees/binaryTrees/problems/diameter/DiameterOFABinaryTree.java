package dsa.dataStructures.nonLinear.trees.binaryTrees.problems.diameter;

public class DiameterOFABinaryTree {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    static int diameter=0;
    static int height(Node root){
        if(root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        diameter = Math.max(diameter,left+right);//this is for the diameter
        return Math.max(left,right)+1;//this is for the height
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//        root.left.left.left = new Node(8);
        System.out.println("The diameter of the tree is:");
        height(root);
        System.out.println(diameter);
        System.out.println(height(root));
    }
}
