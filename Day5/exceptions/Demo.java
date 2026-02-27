package Day5.exceptions;

public class Demo {
    public static void main(String[] args) {
        try{
            int balance = 2000;
            int withdraw = 3000;
            if(withdraw > balance){
                throw new ArithmeticException("Insufficient funds");
            }
            System.out.println("Withdrawal succesfull");
        }catch (Exception e){
            System.out.println("Exception caught"+e.getMessage());
        }
    }
}
