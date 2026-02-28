package day6.innerClass.anonymousInnerClass;

public interface Payment {
    void pay();
}
class PaymentDemo{
    public static void main(String[] args) {
        //Boilerplate Code
        Payment p = new Payment(){
          public void pay(){
              System.out.println("Payment done using Credit Card");
          }
        };
        p.pay();
        //SCALA - Java 8(Streams,Annotations,Lambdas,Reflection)
        Payment p1=()-> System.out.println("cash payment");
        p1.pay();
    }
}
/*
ℹ️Points To remember:
⭐One-time implementation
⭐No need to create seperate class
⭐It is used in events & callback functions

 */
