package dsa.collections.queues;
import java.util.*;
public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders=new LinkedList<>();//⭐here Queue is the interface

        //💠to add to the linked list
        orders.add("Order101");//strict capacity based
        orders.offer("Order102");//this is flexible
        System.out.println(orders);

        //💠to remove the element in the linked list
//        System.out.println(orders.remove());//Strict [fail]
        System.out.println("Serving"+orders.poll());//Not strict[not fail]//removes firsts
        System.out.println(orders);
        System.out.println(orders.element());//it returns to the first element

    }
}
