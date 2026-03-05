package dsa.algos.searching;

import java.util.Arrays;

public class BinarySearch {
    static int binarySearch(int[] arr,int key){
        int s=0;
        int e=arr.length-1;
        while(s<=e){//it should be less than or equal bcz if it is seen in same index
            int mid=s+(e-s)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                s=mid+1;//Go to the right side to find the key
            }else {
                e=mid-1;//go to the left hand side
            }
        }
        return -1;//If the key was not found
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,9,10};//it should be the sorted array
        System.out.println(binarySearch(arr,4));
        System.out.println(binarySearch(arr,100));
        //⭐⭐if we want the key value also
        int key=4;
        int index=binarySearch(arr,key);//here we perfrom the operation and store in the index
        if(index!=-1){
            System.out.println(key+" found at index "+index+" in array"+ Arrays.toString(arr));
//here we have the
        }else {
            System.out.println(key+"is not found in the array"+ Arrays.toString(arr));
        }
    }
}
//here it will check the mid value and then return the index of the mid
