package Day5.threads;

public class ATMTransaction extends Thread{
    public void run(){
        System.out.println("Processing ATM Transaction");
    }

    public static void main(String[] args) {
        ATMTransaction t1 = new ATMTransaction();
        System.out.println("Thread State"+t1.getState());//geState() to get the state
//        System.out.println("Thread Name"+t1.getName());//getName gives the name of the state
        t1.start();
        System.out.println("Thread State after start"+t1.getState());//Runnable
//        System.out.println("Thread Name after start"+t1.getName());
    }

}
/*
ℹ️code explanantion:
Initially the thresad is in the New state,After calling start(),
it moves to RUNNABLE and executes the run() method.
The exact rimming of the state changes depends on the JVM Scheduler
ℹ️Points to remember:
⭐Threas is  created once.
⭐


 */
