
package javabasics;

import java.util.Scanner;

public class revese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        int rev =0;
        int d;
      
               while(n!=0){
                   d=n%10;
                   rev = rev*10+d;
                   n=n/10;
                 
                }
                 System.out.println(rev);
        }
        

    }
    
    
    
