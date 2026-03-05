package day6.questions.arrayProblems;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];//it adds the prefix with the next elelent in the array

        }
        for(int x: prefix){
            System.out.println(x +" ");
        }

    }


}
