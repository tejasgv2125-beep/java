package dsa.bitManipulation;

import java.util.Scanner;

public class EvenOddBit {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number" );
        n = sc.nextInt();

        if((n&1)==0){
    System.out.println(n+"is even");

        }else{
    System.out.println(n+"is odd");
        }
    }
}
