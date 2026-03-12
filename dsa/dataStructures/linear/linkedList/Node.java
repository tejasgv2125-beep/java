package dsa.dataStructures.linear.linkedList;
//💠💠💠Best way is to create the separte class
class LL{
    Node head;
    private int size;
    LL(){
        size = 0;
    }
    public class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;//We don't know the address of the next node
            size++;//Increment the size as soon as a node si created
        }
    }
    public void printList(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("Null");
    }
    public void addFirst(String data){
        //Create the new node
        //⭐⭐⭐in the insert operation we should create the new node  and convert it as the head
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        //Create the new node
        //⭐⭐⭐(mandatory in the insert operation we should create the new node  and convert it as the head
        Node newNode = new Node(data);
        //If the lsit is empty
        if(head==null){
            head=newNode;
            return;
        }
        //If there are multiple nodes,we need to find the last node
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        //At the end of this loop,we will stand at last node
        //Point th last node next pointer to the new node
        last.next=newNode;
    }

    public void removeFirst(){
        //Empty List->Cannot remove the head Node.
        if(head==null){
            System.out.println("List is empty,Can't delete the head");
            return;
        }
        //For a Single node the head will point to the next (nulll)
        //For multiple node,the head will point to next(head.next)
        head=this.head.next;//bcz it will go the next node
        size--;
    }
    public void removeLast(){
        //Empty List->Cannot remove the tail node.
        if(head==null){
            System.out.println("List is empty.Can't delete the tail");
            return;
        }
        //Single element in the last
        if(head.next==null){
            head=null;//c/c++ style of code
            size--;
            return;
        }
        //multiple elelemnts in the list
        Node curr= head;
        Node last=head.next;
        while(last.next!=null){
            curr=last;
            last=last.next;
        }//The last node will be cleared by the JVM if not used
        //So, we point the secondLast (curr) node to null pointer
        curr.next=null;
        size--;//good practice to remove the memory

    }
    public void removeTarget(String target){
        if(head==null){
            System.out.println("list is empty.cant delete the target");
            return;
        }
        //case: target is the head node itself
        if(head.data.equals(target)){
            head=head.next;
            size--;
            return;
        }
        // case: target is anywhere in the list
        Node prev=null;
        Node curr=head;
        while (curr!=null&& !curr.data.equals(target)){
            prev=curr;
            curr=curr.next;
        }
        if (curr==null){
            System.out.println("target not found in list");
            return;
        }
        prev.next=curr.next;
        size--;
    }
    public static void main(String[] args) {
        LL sll= new LL();
        //for insterting at the head or end
        sll.addFirst("DSA");
        sll.addFirst("Learning");
        sll.addFirst("are");
        sll.addFirst("we");
        sll.printList();
        //inserting at the last
        sll.addLast("in");
        sll.addLast("Java");
        sll.addLast("at");
        sll.addLast("SNPSU");
        sll.printList();
        sll.removeFirst();
        sll.printList();
        sll.removeLast();//Snpsu will be removed
        sll.printList();
        sll.removeTarget("Learning");
        sll.printList();
        sll.removeTarget("we");
    }
}

