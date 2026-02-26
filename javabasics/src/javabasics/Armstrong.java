
package javabasics;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        int temp=n,sum=0;
        int c=0;
        while(temp!=0){
            c++;
            temp=temp/10;
        }
        temp =  n;
        while(temp!=0){
            int d = temp%10;
            sum+= Math.pow(d,c);
            temp=temp/10;
                }
        if(n==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("not Armstrong");
        }
        }

    }
    

