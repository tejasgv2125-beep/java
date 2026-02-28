package day6.arrays;

public class E1 {
    public static void main(String[] args) {
        //Method 1
        int[] arr1;//Declaration
        arr1 = new int[10];//Memory Allocation
       /*If we don't provide value
        The JVM uses "Fallback Mechanism"
        It uses the default value of that data type
        */
        //Method 2
        int[] arr2 = new int[10];//Declaration+Memory Allocation in single line
        System.out.println(arr2[4]);//0
        System.out.println(arr1[3]);//0
        //Method3
        int[] arr3={1,2,3,4,5};
        //Method 4
        int[] arr4= new int[]{1,2,3,4,5};
    }
}
