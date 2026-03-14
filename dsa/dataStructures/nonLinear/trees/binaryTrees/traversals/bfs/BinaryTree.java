package dsa.dataStructures.nonLinear.trees.binaryTrees.traversals.bfs;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTree {
    public static void leverOrderTraversalOrBFS(TreeNode root) {
        //Base Case//Corner Case//Edge Case
        if(root==null){
            return;
    }
    //You are pushing nodes into the queue,not integers
    Queue<TreeNode> q = new LinkedList<>();
    //Add the root node into the queue& then traverse left& right
    q.add(root);
    //print alla nodes level all by level till queue is empty
    while(!q.isEmpty()){
    TreeNode temp = q.poll();
    System.out.print(temp.data+" ");
    //left subtree
        if(temp.left!=null){
        q.add(temp.left);
        }
        //Right subtree
        if(temp.right!=null){
            q.add(temp.right);
        }
    }
        System.out.println();
    }

    public static void main(String[] args) {

        //💠level 0
        TreeNode root=new TreeNode(1);

        //💠level 1
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        //💠level 2
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        System.out.println("BFS Or Level Order Traversal");
        leverOrderTraversalOrBFS(root);
    }
}


