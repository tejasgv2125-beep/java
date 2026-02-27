package Day5.exceptions;

import java.io.IOException;
/*
java.io.IOException:-fully qualified class name
*For checked exception we always use try-catch block
*the 'throws' keyword dosen't handle the exception
*it only pases on the information to the calling method using try catch
*the trows keyword is written in the method signature(name)

 */

public class CheckedException {
    static void readFile()throws IOException{//here we use throws keyword used only to throe it will not handel this

        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try {
            display();
        }catch (IOException e){
            System.out.println(e);
            System.out.println(e.getMessage());//to get only the message not fully qualified class name

        }
    }
    static void display()throws IOException {
        readFile();
    }

}//java.io.IOException:-
