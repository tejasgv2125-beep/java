package dsa.algos.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinNumberOfCoins {
    static void findMinmumCoins(List<Integer> coins, int V){
        List<Integer> result=new ArrayList<Integer>();
        //If the  array isnot sorted,sort is first
        for(int i=coins.size()-1;i>=0;i--){
            while(V>coins.get(i)){
                V-=coins.get(i);
                result.add(coins.get(i));
            }
        }
        System.out.println(("coins: "));
        for(int coin:result){
            System.out.print(coin+" ");
        }
        System.out.println();
        System.out.println("minimum number of coins is "+result.size());

    }

    public static void main(String[] args) {

        List<Integer> coins= Arrays.asList(1,2,5,10,20,50,100,200,500,1000);
        int V1=91;
        findMinmumCoins(coins, V1);
        int V2=31;
        findMinmumCoins(coins, V2);
        int V3=55;
        findMinmumCoins(coins, V3);
    }
}
