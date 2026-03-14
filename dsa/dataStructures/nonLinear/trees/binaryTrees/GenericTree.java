package dsa.dataStructures.nonLinear.trees.binaryTrees;

public class GenericTree<X>{//here tree can hold any type of data
    private final X data;
    private GenericTree<X> left;
    private GenericTree<X> right;
    public  GenericTree(X data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    //💠Pre-Order Traversal
    void preOrder(){
        System.out.print(this.data+" ");
        if(this.left != null)this.left.preOrder();
        if(this.right != null)this.right.preOrder();
    }
    //💠In-Order Traversal
    void inOrder(){
        if(this.left != null)this.left.inOrder();
        if(this.right != null)this.right.inOrder();
        System.out.print(this.data+" ");
    }

    //💠Post-Order Traversal
    void postOrder(){
        System.out.print(this.data+" ");
        if(this.left != null)this.left.postOrder();
        if(this.right != null)this.right.postOrder();
    }

    public static void main(String[] args) {

        //⭐⭐Here we can use any datatype here

        //💠Integer type of tree
        GenericTree<Integer> integerRoot = new GenericTree<>(1);
        integerRoot.left = new GenericTree<>(2);
        integerRoot.right = new GenericTree<>(3);
        System.out.println("Preorder Integer Tree");
        integerRoot.preOrder();
        System.out.println();
        System.out.println("Inorder Integer Tree");
        integerRoot.inOrder();
        System.out.println();
        System.out.println("Postorder Integer Tree");
        integerRoot.postOrder();
        System.out.println();
        System.out.println();
        System.out.println();

        //💠Float Type of tree
        GenericTree<Float> floatRoot = new GenericTree<>(1.2f);
        floatRoot.left = new GenericTree<Float>(2.4f);
        floatRoot.right = new GenericTree<Float>(4.6f);
        System.out.println("Preorder Float Tree");
        floatRoot.preOrder();
        System.out.println();
        System.out.println("Inorder Float Tree");
        floatRoot.inOrder();
        System.out.println();
        System.out.println("Post order False Tree");
        floatRoot.postOrder();
        System.out.println();
        System.out.println();
        System.out.println();

        //💠Boolean type of tree
        GenericTree<Boolean> booleanRoot = new GenericTree<>(true);
        booleanRoot.left = new GenericTree<Boolean>(false);
        booleanRoot.right = new GenericTree<Boolean>(true);
        System.out.println("Preorder boolean Tree");
        booleanRoot.preOrder();
        System.out.println();
        System.out.println("Inorder boolean Tree");
        booleanRoot.inOrder();
        System.out.println();
        System.out.println("Post order boolean Tree");
        booleanRoot.postOrder();
        System.out.println();
    }
}
