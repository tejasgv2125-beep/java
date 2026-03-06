package dsa.algos.sorting;
import java.util.*;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {//Sandbox(it is the isolated platform which can execute any code)
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6};
        System.out.println("array before sorting"+Arrays.toString(arr1)+Arrays.toString(arr2));
        int[] merged=mergeTwoSortedArrays(arr1,arr2);
        System.out.println("Merged Array:"+ Arrays.toString(merged));
    }
    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int n1=arr1.length;
        int n2=arr2.length;
        int[] merged=new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        //Edge Case
        while(i<n1&&j<n2) {
            if(arr1[i]<arr2[j]) {
                merged[k++]=arr1[i++];
            }else{
                merged[k++]=arr2[j++];
            }
        }
        //Chech if there are any remaining elements in the two arrays
        while(i<n1){
            merged[k++]=arr1[i++];
        }
        while(j<n2) {
            merged[k++]=arr2[j++];
        }
        return merged;
    }

}
