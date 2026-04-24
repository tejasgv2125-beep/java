package fileHandling;

import java.io.*;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("./Demo/ise.txt");
        if(file.delete()){
            System.out.println("File: "+file.getName()+" Deleted");
        }else{
            System.out.println("File Not Found");
        }
    }
}
