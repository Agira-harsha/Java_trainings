package ReaderAndWriter;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    static FileReader fileReader;

    public static void main(String[] args) {

        try {
            // Creates a reader using the FileReader
            fileReader = new FileReader("output.txt");
            int count = 0;
            int input = 0;
            System.out.println("Data in the file : ");
            while ((input = fileReader.read()) != -1) {
                System.out.print((char) input);
                if(!(input==32)) {
                    count++;
                }
            }
            System.out.println("\nLength of the characters in file : " + count);
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            try {
                // Closes the reader
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
