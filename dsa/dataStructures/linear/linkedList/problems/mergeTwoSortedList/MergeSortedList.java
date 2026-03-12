package dsa.dataStructures.linear.linkedList.problems.mergeTwoSortedList;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
public class MergeSortedList {
    static Node mergeSortedList(Node l1,Node l2){
        Node dummy=new Node(0);
        Node tail=dummy;
        while(l1!=null&&l2!=null){
            if(l1.data<l2.data){
                tail.next=l1;
                l1=l1.next;
            }else {
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
        //Attach remaining nodes by just copy pasting
        if(l1!=null){
            tail.next=l1;
        }else {
            tail.next=l2;
        }
        return dummy.next;//Because dummy is pointing to zero
    }
    static void printList(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Node l1=new Node(1);
        l1.next=new Node(3);
        l1.next.next=new Node(5);
        l1.next.next.next=new Node(7);
        l1.next.next.next.next=new Node(9);

        Node l2=new Node(2);
        l2.next=new Node(4);
        l2.next.next=new Node(6);
        l2.next.next.next=new Node(8);
        Node merged=mergeSortedList(l1,l2);
        printList(merged);

    }
}
