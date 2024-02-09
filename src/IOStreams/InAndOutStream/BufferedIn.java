package IOStreams.InAndOutStream;

import java.io.*;
import java.util.Scanner;

public class BufferedIn {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        try {
            System.out.println("Enter the file name :like    data.txt");

            FileInputStream fileInputStream = new FileInputStream(new File(new Scanner(System.in).next()));
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            int value = bufferedInputStream.read();
            while (value != -1){
                System.out.print((char)value);
                value=bufferedInputStream.read();
            }


        } catch (FileNotFoundException e) {
            System.out.println("file was not found!!!");
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
        finally {
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
