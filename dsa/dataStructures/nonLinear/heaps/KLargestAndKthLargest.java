package dsa.dataStructures.nonLinear.heaps;

import java.util.PriorityQueue;

public class KLargestAndKthLargest {
    static void findKLargestAndKthLargest(int[] arr,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        /*⭐Steps
        1.Insert all elements into the heap
        2.Remove the elements exeecding the k size
        */
        for (int num:arr){
            minHeap.add(num);
            if(minHeap.size()>k){
                minHeap.poll();//Remove smallest if size > k
            }
        }
        //⭐Print the kth largest
        System.out.println("The Kth largest is:"+minHeap.peek());
        //⭐Print all the k-Largest elements one by one
        while (minHeap.isEmpty()){
            System.out.println(minHeap.poll()+" ");
        }
        // Print all the K - largest elements one by one
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");

        }
    }
    public static void main(String[] args) {
        int[] arr={19,21,4,9,3,7};
        int k=3;
        findKLargestAndKthLargest(arr,k);
    }
}
