package dsa.dataStructures.linear.linkedList.problems.FloydsCycleDetection;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
//💠interviewr can ask for creating the node using the function
public class CycleDetection {
    static Node head=null;
    //creating the list using functions
    static void createList(){
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        //Creating the cycle
        head.next.next.next.next=head.next;//5th is connected to second
    }
    static boolean hasCycle (){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;//move 1 step
            fast=fast.next.next;//move 2 steps
            if(slow==fast){
                return true;//Detected the cycle
            }
        }
        return false;//No Cycle has been detected
    }

    public static void main(String[] args) {
        createList();
        if(hasCycle()){
            System.out.println("Cycle Detected");
        }else{
            System.out.println("Cycle Not Detected");
        }
        //💠using ternary operator
        System.out.println(hasCycle()?"Detected":"not detected");
    }
}
