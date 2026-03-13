package dsa.dataStructures.linear.stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StacksUsingQueue {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    void push(int x){
        q2.add(x);
        while (!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }
    int pop(){
        return q1.remove();
    }
    public static void main(String[] args) {
        StacksUsingQueue s=new StacksUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

}