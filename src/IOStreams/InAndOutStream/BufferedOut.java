package IOStreams.InAndOutStream;

import java.io.*;
import java.util.Scanner;

public class BufferedOut {
    public static void main(String[] args) {
        System.out.println("create a file ");
        BufferedOutputStream bufferedOutputStream = null;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new Scanner(System.in).next()));
            System.out.println("enter  your data:");
            String data=new Scanner(System.in).nextLine();
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte [] values=data.getBytes();
            bufferedOutputStream.write(values);


        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
        finally {
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
