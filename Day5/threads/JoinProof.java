package Day5.threads;

public class JoinProof {
    static class Task extends Thread{
        public void run(){
            try{
                Thread.sleep(2000);
            }catch(Exception _){


            }
            System.out.println("Task Finished");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Task t1 = new Task();
        t1.start();//The main Thread doesn't wait for the Thread
        t1.join();//code will wit(guaranteed!!)
        System.out.println("Main Thread Finished");


    }
}
