package ReaderAndWriter;

import java.io.*;

public class BuffredWriterExample {
    public static void main(String[] args) {

        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter("data.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("dubai" + ":" + "232-202-232\n");
            bufferedWriter.write("chennai" + ":" + "232-222-232\n");
            bufferedWriter.write("banglore" + ":" + "232-212-232\n");
            bufferedWriter.write("assam" + ":" + "232-272-232\n");

            bufferedWriter.flush();

        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {


            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
