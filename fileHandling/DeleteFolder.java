package fileHandling;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        //.the current directry
        //to enter the current directory we use forwARD SLASH
        //It delets the last levl folder or the inner most folder[Inner Most]
        File folder = new File("./Demo/F1/F2/F3/F4");
        if(folder.delete()){
            System.out.println("Folder Deleted");
        }else{
            System.out.println("Folder Not Deleted");
        }
    }
}
