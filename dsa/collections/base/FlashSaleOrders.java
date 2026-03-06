package dsa.collections.base;

import java.util.*;

public class FlashSaleOrders {
    public static void main(String[] args) {
        Collection<Integer> orderIds = new ArrayList();
        /*⭐⭐here we can access any collection elemnts
        because all the interface implemnts the collection interface
        so we can use the base interface only*/
//      can also be written like this  ArrayList<Integer> orders=new ArrayList();
        orderIds.add(100);
        orderIds.add(102);
        System.out.println("order recived"+orderIds);
        System.out.println("no of order"+orderIds.size());
    }
}
