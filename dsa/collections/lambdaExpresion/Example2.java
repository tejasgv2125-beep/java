package dsa.collections.lambdaExpresion;
interface Add{
    int sum(int a,int b);
}
public class Example2 {
    public static void main(String[] args) {
        Add add=(a,b)->(a+b);
        int result=add.sum(10,20);
        System.out.println(result);
    }

}
