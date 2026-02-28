package Day5.threads;
import java.io.*;
public class BankAccount {
    int balance;
    void withdraw(int amount){
        balance -= amount;
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccount acc = new BankAccount();
        Thread t1 = new Thread(() -> acc.withdraw(500));
        Thread t2 = new Thread(() -> acc.withdraw(500));
        t1.start();
        t2.start();
//        t1.join();
//        t2.join();
        //join() will make sure that the main thread
        //waits for the child threads to complete
        System.out.println("Final Balance:"+acc.balance);

    }
}
/*
⭐Both the threads t1 & t2 acess & modify the same balance variable simontaneously,Due to lack of synchronization,
the final balance becomed inconsistent.
ℹ️Points to remember
⭐Shared data causes issues
⭐Execution order is unpredeictable
⭐leads to dat INCONSTIENCY
⭐Need synchronizatiom to solve the RACE CONDITION
 */