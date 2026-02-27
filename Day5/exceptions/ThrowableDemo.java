package Day5.exceptions;
//throwable will not be asked in the interview but they can ask to write the sample code for that so we use this
/*
throw new String("Error");❌
throw new Integer("Error");❌
throw new Throwable("Error");✅
throw new Exception("Error");✅
throw new RuntimeException("Error");✅
throw new IOException("Error");✅
 */
public class ThrowableDemo {
    static void test() throws Throwable{
        throw new   Throwable("Something went wrong");
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (Throwable t){
            //Fully qualified name
            System.out.println("Handled: " + t);
            //only the message
            System.out.println("Handled: " + t.getMessage());
        }
    }
}
