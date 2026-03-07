package dsa.collections.lambdaExpresion;

interface Square{
    int calculate(int x);
}
public class Example3 {
    public static void main(String[] args) {
        Square s=x -> x*x;
        System.out.println("square:"+s.calculate(5));
    }
}