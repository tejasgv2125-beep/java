package day6.questions.arrayProblems;
public class MissingNumber {
    public static int missingNumber(int[] arr){
        int n= arr.length+1;
        int totalSum=(n*(n+1))/2;
        int arraySum=0;
        for(int i=0; i<n; i++){
            arraySum+=arr[i];
        }
        return totalSum-arraySum;

    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        System.out.println(missingNumber(arr));//here we take the total sum minus the number
        //here array length will be 15 minus the missing number array is 12 so when we add minus the
        //the actual array minus the array we will get 3 so 3 is the missing number
    }
}
