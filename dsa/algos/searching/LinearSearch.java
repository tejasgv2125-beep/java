package dsa.algos.searching;

public class LinearSearch {
    static int linearSearch(int[] arr,int target){//we should use the target because
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;//it returns the value of the index if the elemnt is found in the array
            }
        }
        return -1;//if the target is not found it will return the value as the -1
    }

    public static void main(String[] args) {
        int[] arr ={10,52,0,8,1,3};
        System.out.println(linearSearch(arr,10));//0
        System.out.println(linearSearch(arr,80));//-1

    }
}
/*⭐⭐⭐here the time complexity will be O(n) because only one for loop
the fastest time complete will be if the number is present in the first place
and the time coplexity will be more if the number is found in the last place*/
