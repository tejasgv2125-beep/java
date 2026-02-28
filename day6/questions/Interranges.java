package day6.questions;

public class Interranges {
    public static void main(String[] args) {
        System.out.println("Integer max value:"+Integer.MIN_VALUE);//-2^31
        System.out.println("Integer min value:"+Integer.MAX_VALUE);//2^31 - 1
        System.out.println("Integer max value:"+(Integer.MIN_VALUE-1));// it will become max value
        System.out.println("Integer max value:"+(Integer.MAX_VALUE+1));// it will become min value
    }
}
