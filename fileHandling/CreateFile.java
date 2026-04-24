package fileHandling;

import java.io.*;


public class CreateFile {
    public static void main(String[] args) throws Exception{
        //Extension is needed or else the junk file will be created
        File file=new File("./Demo/ise.txt");
        if(file.createNewFile()){
            System.out.println("File: "+file.getName()+" has been created");
        }


    }
}
