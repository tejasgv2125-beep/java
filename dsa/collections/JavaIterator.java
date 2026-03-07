package dsa.collections;
import java.util.*;
public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(21);
        list.add(22);
        list.add(32);
        list.add(5);
        list.add(6);
        list.add(21);
        System.out.println(list);

        //ℹ️Iterator is the interface
        Iterator<Integer> it=list.iterator();

        //we are using iteration for the removal by traversing through the elements in the list
        //Remove the elements which are greater than 10
        while(it.hasNext()){//to go next
            Integer i=it.next();
            if(i>10){
                it.remove();
            }

        }
        System.out.println(list);

    }
}
