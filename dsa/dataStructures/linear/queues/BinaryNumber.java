package dsa.dataStructures.linear.queues;

import java.util.*;
public class BinaryNumber {
    public static void main(String[] args) {
        int n=5;
        Queue<String> q=new LinkedList<>();
        q.offer("1");
        while(n-- >0){
            String curr=q.poll();
            System.out.print(curr+" ");
            q.offer(curr+"0");
            q.offer(curr+"1");

        }
        System.out.println();

    }
}