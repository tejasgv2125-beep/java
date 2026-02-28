package day6.arrays;
//Vargas->...{It internally uses arrays}
public class E6 {
    public static void display(int... arr){
        //[] also be written as ...
        for(int num: arr){
            System.out.println(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {100,200,300,400,500};
        display(arr);

    }
}
