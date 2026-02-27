package Day5.exceptions;

public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
//        j=0;
        j=10;
        try{
            k=i/j;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[9]);
            //we Cannot use base class on above all class
//        }catch(Exception e){//herw we can use thw Exception class if we dont know the exception
//            System.out.println("some error");//here it can handel anthing but earlier i hvae handedled already the exception
//            //now its ok we can handel
//            e.printStackTrace();//we should not initialize first because we dont need to handel its exception but we know already the exception
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
            e.printStackTrace();//it gives the detail of the exception
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
            e.printStackTrace();//it gives the detail of the exception
        }catch(Exception e){//herw we can use thw Exception class if we dont know the exception
            System.out.println("some error");//here it can handel anthing but earlier i hvae handedled already the exception
            //now its ok we can handel
            e.printStackTrace();
        }finally {
            System.out.println("Start Execution");
            System.out.println("Turn OFF Load DB");
            System.out.println("Turn OFF Load Interest");
            System.out.println("TURN OFF Load Files");
            System.out.println("TURN OFF Load Docker-Kubernetes");

        }
        System.out.println("The ans is"+k);
    }
    static{
        System.out.println("Start Execution");
        System.out.println("Load DB");
        System.out.println("Load Interest");
        System.out.println("Load Files");
        System.out.println("Load Docker-Kubernetes");
    }

}
