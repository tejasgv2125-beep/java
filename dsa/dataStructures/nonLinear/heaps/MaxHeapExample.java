package dsa.dataStructures.nonLinear.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap= new  PriorityQueue<>(Collections.reverseOrder());//for doing the heap we should use priority queue
        /*ℹ️⭐⭐⭐ℹ️ by default it will take min heap to conevrt this is into the max heap we will use
         Collections revese method*/
        //2 9 6 8 4 3 1 0
        //💠Adding the element into the heap
        maxHeap.add(2);
        maxHeap.add(9);
        maxHeap.add(6);
        maxHeap.add(8);
        maxHeap.add(4);
        maxHeap.add(3);
        maxHeap.add(1);
        maxHeap.add(0);
        System.out.println("Min Heap:"+maxHeap);
        System.out.println(maxHeap.poll());
    }
}
