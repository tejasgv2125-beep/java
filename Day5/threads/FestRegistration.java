package Day5.threads;

public class FestRegistration {
    static class FormFilling extends Thread{
        public void run(){
            System.out.println("Form Filling Started");
        }
    }
    static class DocumentsUpload extends Thread{
        public void run(){
            System.out.println("Document Uploading Started");
        }
    }
    static class EmailNotification extends Thread{
        public void run(){
            System.out.println("Confirmation email started");
        }
    }

    public static void main(String[] args) {
        FormFilling t1 = new FormFilling();
        DocumentsUpload t2 = new DocumentsUpload();
        EmailNotification t3 = new EmailNotification();
        t1.start();
        t2.start();
        t3.start();//in thread there is no order gaurenteee

//        t1.run();
//        t2.run();
//        t3.run();//there is now concurency no threads are create when we call this
    }
}
/*
Points to remember
⭐Java program starts with one main thread
⭐Threads allow parrellel exection ->concurency
⭐Output order is not gaurentedd
⭐Threads share the same memory
⭐Impoves the performance & responsiveness
⭐⭐When start() is called the JVM creates the new Thered
⭐⭐When run() is called directly,it will not concurency it will be in sequesnce
ℹ️Process Vs Thread
⭐Process is a running program
⭐Thread : A path of Execution inside the program
⭐Creating the thread is cheaper than creating a process
⭐Examples:Process-> Chrome Browser Thread->New tab of Chrome
🟢Closing a tab will not close chrome or kill chrome


 */