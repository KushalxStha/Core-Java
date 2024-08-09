package _04_Read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    // FileReader: read the contents of a file as a stream of characters. One by one
    //             read() returns an integer value which contains the byte value
    //             when read() returns -1, there is no more data to be read

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("files/mickey.txt");
            int data = reader.read();
            while(data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
