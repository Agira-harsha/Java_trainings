package ReaderAndWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;
import java.io.IOException;

public class StringReaderExample {
    public static void main(String[] args) {
        String text = "Hello, this is harsha kohli";


        try (StringReader reader = new StringReader(text)) {

            System.out.println("Reading characters:");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();

            reader.reset();
            reader.skip(7);

            System.out.println("Reading characters after skipping:");
            char[] buffer = new char[20];
            int bytesRead = reader.read(buffer);
            System.out.println("Bytes read: " + bytesRead);
            System.out.println(buffer);
            reader.reset();

            reader.mark(5);

            char[] markedBuffer = new char[5];
            int markedbytesRead = reader.read(markedBuffer);
            System.out.println("Bytes read after marking: " + markedbytesRead);
            System.out.println(markedBuffer);


            reader.reset();

            System.out.println("Reading characters after resetting:");
            int remaining;
            while ((remaining = reader.read()) != -1) {
                System.out.print((char) remaining);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
