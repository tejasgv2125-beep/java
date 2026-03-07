package dsa.collections.lambdaExpresion;

import java.util.ArrayList;
import java.util.Collections;

public class Example5 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println("Initial List: "+list);
        Collections.sort(list,(a,b)->a-b);//Ascending order
        System.out.println("Sorted list(Ascending): "+list);
        Collections.sort(list,(a,b)->b-a);//Descending order
        System.out.println("Sorted list(Decending): "+list);
    }
}
