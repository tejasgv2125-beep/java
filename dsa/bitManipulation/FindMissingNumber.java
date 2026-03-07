package dsa.bitManipulation;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int n=arr.length+1;
        int xor1=0;
        int xor2=0;
        for(int i=1;i<=n;i++){
            xor1 ^=i;
        }
        for (int num:arr){
            xor2 ^=num;
        }
        int missing=xor1^xor2;
        System.out.println("missing element:"+missing);

    }
}
