package _03_Write;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("files/created_file.txt");
            file.write("This is written directly from the code.\nThis is second line.");
            file.append("File has been appended.");
            file.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            //e.printStackTrace();
        }
    }
}
