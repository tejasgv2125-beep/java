package dsa.algos.sorting;

import java.util.Arrays;
public class    SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){//(n-1) Iteration
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){//What we took as min Index is wrong,so swap
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;

            }
        }

    }

    public static void main(String[] args) {
        int[] arr={5,2,9,1,0,3,6};
        System.out.println("Before sorting"+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After sorting"+ Arrays.toString(arr));
    }
}
//here it start from starting index next it will start from j
//it checks the next array elelments if it is less than the i it will swap other wise it will not swap\
//the ti,e cpmplexity is O(n