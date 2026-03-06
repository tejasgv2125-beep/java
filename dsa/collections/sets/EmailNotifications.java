package dsa.collections.sets;


import java.util.*;

public class EmailNotifications {
    public static void main(String[] args) {
        Set<String> emailQueue=new HashSet<>();//here set is the interface

        //ℹ️⭐⭐⭐ℹ️ HashSet automatically removes the duplicate

        //💠to add the element into the set
        emailQueue.add("a@gmail.com");
        emailQueue.add("b@gmail.com");
        emailQueue.add("c@gmail.com");
        emailQueue.add("a@gmail.com");
        emailQueue.add("a@gmail.com");
        System.out.println("Emails to send"+emailQueue);

        //💠to know the size of the hashset
        System.out.println("Unique emails"+emailQueue.size());



    }
}
