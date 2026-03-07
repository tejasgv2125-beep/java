package dsa.collections.maps;

import java.util.HashMap;

public class FrequencyMap {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1,4};
        HashMap<Integer,Integer> map=new HashMap<>();

        //💠to get the frequency of the each eleent we use this
        for (int num:arr) {
            //{1=2,2=2,3=1,4=1}
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);

        //💠To get the value for the key we use get method
        System.out.println(map.get(4));
    }
}
