package Day5.threads;

public class ThreadWithPriority extends Thread{
    public void run(){
        for(int i=0;i<=3;i++){
            System.out.println(Thread.currentThread().getName()+"|priority:"+Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        ThreadWithPriority t1 = new ThreadWithPriority();
        ThreadWithPriority t2 = new ThreadWithPriority();
        ThreadWithPriority t3 = new ThreadWithPriority();
        t1.setName("Low Priority Thread");
        t2.setName("Medium Priority Thread");
        t3.setName("High Priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
//        t3.setPriority(11);//IllegalArgumentException
        t1.start();
        t2.start();
        t3.start();


    }
}
/*
ℹ️Points to Remember:
⭐Thread Priority is only a suggestion to the JVM to scheduler
⭐⭐⭐High priority dosen't guarentee execution order
⭐👆ans:-Higher priority threads may get more cpu Scheduler Time.
⭐The Actual behaviur depends on the JVM & Operating System
*/
