 package dsa.dataStructures.nonLinear.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        //💠💠💠in cpp pq it's a max heap by default
        //💠💠💠in java pq it's a min heap by default
        PriorityQueue<Integer> minHeap= new  PriorityQueue<>(Collections.reverseOrder());//for doing the heap we should use priority queue
        //ℹ️⭐⭐⭐ℹ️ by default it will take min heap to conevrt this is into the max heap we will use
        // Collections revese method
        //2 9 6 8 4 3 1 0
        //💠Adding the element into the heap
        minHeap.add(2);
        minHeap.add(9);
        minHeap.add(6);
        minHeap.add(8);
        minHeap.add(4);
        minHeap.add(3);
        minHeap.add(1);


        minHeap.add(0);
        System.out.println("Min Heap:"+minHeap);
        System.out.println(minHeap.poll());

    }
}
