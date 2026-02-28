package Day5.threads;

public class DeadClassDemo {
    static final Object accountA = new Object();
    static final Object accountB = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            synchronized (accountA) {
                System.out.println("Thread 1  locked Account A");
                try{
                    Thread.sleep(2000);
                }catch(Exception e){
                }
                synchronized (accountB) {
                    System.out.println("Thread 1  locked Account B");
                }
            }

        });
        Thread t2 = new Thread(()->{
            synchronized (accountB) {
                System.out.println("Thread 2  locked Account A");
                try{
                    Thread.sleep(2000);
                }catch(Exception _){
                }
                synchronized (accountA) {
                    System.out.println("Thread 2  locked Account B");
                }
            }

        });
        t1.start();
        t2.start();
    }
}
/*
Thread -1 acquirers a lock on Account A and then sleeps,giving
Thread -2 to acquire a lock on Account B.Now,Thread-1 Waits for Account A & Thread-2 waits for Account B.
Since neither thread releases the lock.Both keep waiting & thus creating a DEADLOCK❌🔒
ℹ️DEADLOCK EXPLANATION:Deadlock occurs when each thread is holding
a resources &  waiting for the other to release it.

*/
