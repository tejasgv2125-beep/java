package dsa.algos.dynamicProgramming.oneD;

import java.util.Arrays;

public class fibonacciMemoisation {

    public static int fib(int n,int[] dp){
        if (n<=1) return n;
        if (dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    }

    public static void main(String[] args) {
        int n=6;
        //💠step 1:create 1D dp table of size n+1)o based)
        int[] dp=new int[n+1];//0 based indexing
        //substep of 1:Fill the array with the minus one
        Arrays.fill(dp,-1);

        System.out.println("fibonacci of index 6: "+fib(n,dp));



    }
}
