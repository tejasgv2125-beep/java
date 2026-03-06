package dsa.algos.searching.BinarySearchApplication;

public class FirstLastTotalOcc {
    public static int firstOcc(int[] arr, int key){
        int s =0;
        int e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid]==key){
                ans = mid;
                e = mid-1;
            } else if(arr[mid]<key){
                s = mid + 1;

            }else {
                e = mid - 1;
            }
        }
        return ans;

    }



public static int LastOcc(int[] arr, int key){
    int s =0;
    int e = arr.length-1;
    int ans = -1;
    while(s <= e){
        int mid = s + (e-s)/2;
        if(arr[mid]==key){
            ans = mid;
            s = mid + 1;
        } else if(arr[mid]<key){
            s = mid + 1;

        }else {
            e = mid - 1;
        }
    }
    return ans;

}

public static int totalOcc(int[] arr, int key) {
    int fo = firstOcc(arr, key);
    int lo = LastOcc(arr, key);
    return lo - fo + 1;
}

public static void main(String[] args) {
    int[] arr = {1, 2, 3, 3, 3, 4, 5, 6};
    int f = firstOcc(arr, 3);
    int l = LastOcc(arr, 3);
    int t = totalOcc(arr, 3);
    System.out.println("First Occurance Index: " + f);
    System.out.println("Last Occurance Index: " + l);
    System.out.println("total Occurance Index: " + t);
}
}