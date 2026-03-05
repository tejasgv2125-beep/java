package dsa.algos.searching;
//Recursive is used bcz s and e are changing so we use the recursive binary search
public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr, int key, int s, int e){
        //what are the changing elements we pass it to the argumnets
        if(s > e) return -1;//Base case->Key not found[we go out of bounds
        int mid = s + (e-s)/2;
        if(arr[mid] == key) return mid;
        else if(arr[mid] < key)
            return recursiveBinarySearch(arr, key, mid+1, e); // start change
        else
            return recursiveBinarySearch(arr, key, mid-1, e); // end change
    }

    public static void main(String[] args) {
        int[] arr = {2,5,8,12,16,23,38,45};
        int key = 23;
        int result = recursiveBinarySearch(arr, key, 0, arr.length-1);
        System.out.println("Element:"+key+" found at index: " + result);
    }
}