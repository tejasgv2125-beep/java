package dsa.collections.lambdaExpresion;

public class Example1 {
    public static void main(String[] args) {
        Runnable r=()->{
            System.out.println("Thread is running using lambda(->)");
        };
        Thread t=new Thread(r);
        t.start();
    }
}
