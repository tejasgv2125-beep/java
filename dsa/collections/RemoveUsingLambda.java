package dsa.collections;

import java.util.*;

public class RemoveUsingLambda {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(21);
        list.add(22);
        list.add(32);
        list.add(5);
        list.add(6);
        list.add(21);
        System.out.println("Befor:"+list);

        //💠Remove the elemnt using the labmda function

        list.removeIf(n->n%2==0);// it is the built in function in the iterable interface
        // n(predicate),>(labmda),n%2==0(condition)
        System.out.println("After list"+list);

    }
}
