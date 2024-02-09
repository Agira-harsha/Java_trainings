package IOStreams.InAndOutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingOutput {


    public static void main(String[] args) {
        System.out.println("create a file  like :data.txt");
        File file = new File(new Scanner(System.in).next());
        FileOutputStream fileOutputStream = null;
        try {
            String data = "Hello this is Fileoutput stream file";
            fileOutputStream = new FileOutputStream(file);

            byte[] dataBytes = data.getBytes();

            fileOutputStream.write(dataBytes);
            fileOutputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
