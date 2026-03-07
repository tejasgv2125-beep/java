package dsa.collections.lambdaExpresion;
interface calculator{
    int operate(int a,int b);
}
public class LambdaReturnStatement {
    public static void main(String[] args) {
        calculator  multiply=(a,b)->{
            int result=a*b;
            return result;
        };
        System.out.println("Multiplication:"+multiply.operate(1,2) );
    }
}
