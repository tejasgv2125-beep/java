package dsa.algos.special;

public class KadaneAlgo {
    static int kadaneAlgo(int[] arr){
        int cMax = arr[0];
        int gMax = arr[0];
        for(int i=1;i<arr.length;i++){
            cMax = Math.max(cMax,arr[i]);//Math.max should be used
            gMax = Math.max(cMax,gMax);
        }
        return gMax;
    }

    public static void main(String[] args) {
        int[] arr = {5,-8,1,2,-1,4};
        System.out.println(kadaneAlgo(arr));
        int[] array={-1,-2,-3,-3,-5,-6,0};
        System.out.println(kadaneAlgo(array));//here the output will be 0 becauase 0 is the highest
    }
}
