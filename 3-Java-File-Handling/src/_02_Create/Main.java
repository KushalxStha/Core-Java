package _02_Create;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File file = new File("files/created_file.txt");

        try {
            if(file.createNewFile()) {  // Returns true if created, false if not
                System.out.println("File Created: "+ file.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
