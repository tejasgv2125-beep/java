package day6.arrays;

public class E2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1]=40;
        System.out.println(arr[1]);
        /*Acess & Update elemnts in an array-> TC O(1)
        This is because of index-based acces or
        direct index-aping
        [idx=pos-1] or[pos =idx+1]*/

        //// For Traversing
        /*ℹ️.length is not the method it is the property
        ☑️array.length is a property
        ☑️string.length() is a method
        example
        String name ="Java";
        System.out.println(name.length());*/
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();//extra print statement is to go to the nect line
        for(int x :arr){//it is the enhanced or for each loop
            System.out.println(x+" ");
        }
        System.out.println();
        for(Object o : arr){
            System.out.println(o+" ");
        /*
        ℹ️Memory Management
        ⭐Array object is strored in the heap
        ⭐Variable reference is stored in the Heap
        ⭐Elements are stores in contigounus memory block
        🟢char[1][1][1][1] int[4][4][4][4] double[8][8][8][8] bytes
           */
    }
    }

}
