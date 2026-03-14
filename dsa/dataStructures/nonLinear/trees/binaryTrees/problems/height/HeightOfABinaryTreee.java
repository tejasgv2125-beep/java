package dsa.dataStructures.nonLinear.trees.binaryTrees.problems.height;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }//this is the use for the creation of the tree nodes


}
public class HeightOfABinaryTreee {
    static int findheight(Node root){
        //Base Case->f the root is null the tree is empty
        if(root==null){
            return 0;
        }
        int leftHeight=findheight(root.left);
        int rightHeight=findheight(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);//for inserting we use '.' operator
        root.right=new Node(3);
        root.right.right=new Node(4);
        System.out.println("Height of the 1st tree:"+findheight(root));
        Node root1=null;
        System.out.println("Height of the second tree:"+findheight(root1));
    }
}
