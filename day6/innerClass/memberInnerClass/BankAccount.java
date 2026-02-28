package day6.innerClass.memberInnerClass;

public class BankAccount {
    private double balance;
    //Member class
    class Transaction{
        void withdraw(double amount){
            if(amount <= balance){
                balance -= amount;
                System.out.println("Withdrawn:"+ amount);
            }else {
                System.out.println("Not enough money");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        //Outer.Inner in_Object = out_object.new Inner();
        BankAccount.Transaction tx = bankAccount.new Transaction();
        tx.withdraw(3000);
        tx.withdraw(2000);
        System.out.println(bankAccount.balance);

    }
}
/*
ℹ️Points to remember
⭐Transaction belongs to specific account
⭐Direct acces to private variable balance
⭐Clean encapsulation
 */
