package day4.Strings;

public class ReverseAString {
    public static void main(String[] args) {
        String str="Hello World";
        String reverse="";
        System.out.println("original String:"+str);
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println("Reverse:"+reverse);
    }
}
