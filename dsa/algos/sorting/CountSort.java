package dsa.algos.sorting;

import java.util.Arrays;

public class CountSort {
    public static void countSort(int[] arr){
        //step1:Find the max
        int k=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>k){
                k=arr[i];
            }
        }
        //Step 2: Create a count array[0-max]
        int[] count = new int[k+1];
        //step 3:Calculate the freq of each elelmnt in the array
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //step4:Calculate the cumulative frequency
        //Skip index 0a and start from 1 till max(k)
        for(int i=1;i<=k;i++){
            //curr = curr+prev
            count[i]+=count[i-1];
        }
        //Step 5:Create the ouput array
        int[] output=new int[arr.length];
        //Step 6:Start from the end of the array (L<-R)
        for(int i=arr.length-1;i>=0;i--){
            output[--count[arr[i]]]=arr[i];

        }
        //Copy the outputr back to the input
        System.arraycopy(output,0,arr,0,arr.length);
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,3,4,1,6,4,3};
        System.out.println("before sorting"+ Arrays.toString(arr));
        CountSort.countSort(arr);
        System.out.println("after sorting"+ Arrays.toString(arr));

    }
}
//Time Complexity O(n+max)
