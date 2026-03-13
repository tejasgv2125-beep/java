package dsa.dataStructures.linear.stacks;
//Here we are taking the size by the user input
public class IntegerStack {
    int arr[];
    int top;
    int capacity;
    IntegerStack(int size) {//this is teh constructor
        capacity = size;
        arr=new int[size];//Stack of the integers array
        top=-1;
    }

    //💠Function to push the elements
    void push(int x) {
        if(top==capacity-1) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top]=x;//this is compulsory //it will increment and then adds the value
        System.out.println("Added"+x+"to the top of the stack");
    }

    //💠Function to pop the element from the stack
    int pop() {
        if(top==-1) {
            System.out.println("Stack is empty(underflow)");
            return -1;
        }
        return arr[top--];//first remove the value and decrement
    }

    //💠Function to display
    void display(){
        if(top==-1){
            System.out.println("Stack underflow.Nothing to display");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        IntegerStack s=new IntegerStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("popped:"+s.pop());
        s.display();
    }
}
