package dsa.dataStructures.nonLinear.trees.binaryTrees.traversals.dfs;
//⭐⭐⭐Here we are using the linked list  because of the FIFO property

public class TreeNode {
    int data;//The data of the node
    TreeNode left;//The reference to the left child
    TreeNode right;//The reference to the right child
    TreeNode(int data){//here we are using the constructor for the input
        this.data=data;
        this.left=null;
        this.right=null;//initially the node ha no children
    }

    //💠💠💠Pre Order Traversal
    public static void preOrder(TreeNode root){//DLR Format
        if(root!=null){//if the root is not null so we can traverse
            System.out.print(root.data+" ");
            preOrder(root.left);//using the recursion we should use this
            preOrder(root.right);
        }
    }

    //💠💠💠In Order Traversal
    public static void inOrder(TreeNode root){//LDR Format
        if(root!=null){//if the root is not null so we can traverse
            inOrder(root.left);//using the recursion we should use this
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

    }

    //💠💠💠Post Order Traversal
    public static void postOrder(TreeNode root){//LRD Format
        if(root!=null){//if the root is not null so we can traverse
            postOrder(root.left);//using the recursion we should use this
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        //⭐Rule for constructing the binary tree is =>Top to bottom & left to right
        //Level by level
        //⭐⭐⭐here we should use like the linked lsitr where we shoul use. to use for lefyt and right

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

        //💠level 3
        root.left.right.left=new TreeNode(9);
        root.left.right.left=new TreeNode(15);

        //Pre order traversal display
        System.out.println("preorder Traversal");
        preOrder(root);
        System.out.println();

        //Inorder Traversal display
        System.out.println("inorder Traversal");
        inOrder(root);
        System.out.println();

        //Post Order Traversal display
        System.out.println("postorder Traversal");
        postOrder(root);
        System.out.println();
    }
}
