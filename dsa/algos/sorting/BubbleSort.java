package dsa.algos.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){//1 to n-1=> <n[Iterations]
            for(int j=0;j<n-i;j++){
                // we can opti,ize the code by using i instead of 1
                //because every iteration we will decrease the elements in every iterartion
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={9,2,1,3,7,6,5};
        System.out.println("Before sorting"+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After sorting"+ Arrays.toString(arr));

    }
}
