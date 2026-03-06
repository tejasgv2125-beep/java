package day4.Strings;

import java.util.Arrays;

public class Anagrams {
    //which have same charrecters with the different words
    //SILENT LISTEN,NIGHT THING,ARTICLE RECITAL,DIRTY ROOM DORMENTRY
    public static void main(String[] args) {
        String s1="silent";
        String s2="listen";
        System.out.println("original string1:"+s1);
        System.out.println("original string2:"+s2);
        char[] arr1=s1.toCharArray();//to covert string to array//s,i,l,e,n,t
        char[] arr2=s2.toCharArray();//to convert string to array//l,i,s,t,e,n
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        if(Arrays.equals(arr1,arr2)){//to check the equals in the arrays
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
