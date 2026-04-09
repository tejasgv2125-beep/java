package dsa.dataStructures.nonLinear.trees;

import java.util.Scanner;

public class SegmentTree {
    private static final int MAX_SIZE = 10005;//Maximum size of the
    private static int[] a= new int[MAX_SIZE];
    private static int[] seg=new int[4*MAX_SIZE];
    //Function to build the segment tree
    private static void build(int ind,int low,int high){
        if(low==high){
            seg[ind]=a[low];//A leaf node will hava single element
            return;
        }
        int mid=(low+high)/2;
        build(2*ind+1,low,mid);//Build Left Child
        build(2*ind+2,mid+1,high);//Build right child
        seg[ind]=Math.max(seg[2*ind+1],seg[2*ind+2]);//store the value of the max

    }
    //Function to query the maximum in a given range[l,r]
    private static int query(int ind,int low,int high,int l,int r){
        if(low>=l&&high<=r){//Completly overlap
            return seg[ind];
        }
        if(high<l||low>r){//No Overlap
            return Integer.MIN_VALUE;//Return minimum possible value
        }
        int mid=(low+high)/2;//Partial overlap
        int left=query(2*ind+1,low,mid,l,r);//Query left child
        int  right=query(2*ind+2,mid+1,high,l,r);//Query right child
        return Math.max(left,right);//Return the max of the both the children
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();//size of the input array
        System.out.println("Enter the elements:");
        for(int i=0;i<=n;i++){
            a[i]=sc.nextInt();
        }
        build(0,0,n-1);//Build the Segment Tree
        System.out.println(("Enter the number of queries"));
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter the range[l,r]:");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int result=query(0,0,n-1,l,r);
            System.out.println("Maximum range ["+l+","+r+"]is:"+result);
        }
        sc.close();

    }
}
