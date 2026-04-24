package fileHandling;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println(path);
        File folder = new File(path + "\\Demo\\F1\\F2\\F3\\F4");
        //mkdir->only creates the last folder of the path is correct
        //mkdirs->Created gro[u of folders if the initial path is created
        if (folder.mkdirs()) {
            System.out.println("Folder " + folder.getName() + "created");
        } else {
            System.out.println("folder already exists");
        }
    }
}
//mkdir-only one directry will be created
//mkdir-full directry will be created