package day6.questions.arrayProblems;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] arr ={3,8,5,12,7,6};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(arr[left]%2==0){
                left++;//if the lefyt side has the evem number move forward
            }
            while(arr[right]%2!=0){
                right--;//if the right side has the odd numbers,move backwards
            }
            if(left<right){//If the numbers&sides don't macth,swap
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }

        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

}
