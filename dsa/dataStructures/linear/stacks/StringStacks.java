package dsa.dataStructures.linear.stacks;

public class StringStacks {
    private static final int MAX_SIZE=10;//here we are using the final key word because its ifd the final max value
    private String[] arr=new String[MAX_SIZE];//to declare the size of the variable
    private  int top=-1;//it describes about that top is -1(stack is initially empty)

    //💠this function checks wheather the stack is empty
    public boolean isEmpty(){
        return top==-1;//if the stack is empty return -1
    }

    //💠This function is used to check about the stack is full
    public boolean isFull(){
        return top== MAX_SIZE - 1;
    }

    //💠Function to push the element into the stack
    public void push(String data){
        if(isFull()){//here we are already having the method is full dont need
            System.out.println("Stack overflow.Can't add more elements");
            return;
        }
        arr[++top]=data;//good practice to pre increment the stack before inserting any of the data
        System.out.println("The String:"+data+"Was pushed to stack.");
    }

    //💠Function to pop the element into the stack
    public String pop(){
        if(isEmpty()){
            System.out.println("Stack underflow.Can't remove the top element");
            return null;
        }
        String popped=arr[top--];//to decrement to the back element
        return popped;
    }

    //💠Function to display the elements in the stack
    public void display(){
        if(isEmpty()){
            System.out.println("Stack underflow.Can't display");
            return;
        }
        System.out.println("The Stack elements in order [LIFO] are:");
        for(int i=top;i>=0;i--){//it will print from the last element of the stack
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //💠to get the size of the stack
    public int size(){
        return top+1;
    }

    //💠To know about the top elemnt in the stack we use peek
    public String peek(){
        //the intenstion is the fetch thet top element
        //💠peek only give the top elemnt it only give the value of the top element
        if(isEmpty()){
            System.out.println("Stack underflow.Can't peek");
            return null;
        }
        return arr[top];//it goes to the top of the array
    }

    public static void main(String[] args) {
        StringStacks s=new StringStacks();
        s.pop();//we cant remove because there is no element in the stack to remiove it
        s.push("Mango");
        s.push("pineapple");
        s.push("apple");
        s.display();
        System.out.println("Top Element:"+s.peek());
        String popped=s.pop();
        System.out.println("Popped element is:"+popped);
        s.display();
        System.out.println("Size of the stack is:"+s.size());

    }
}
