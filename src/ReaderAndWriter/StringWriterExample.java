package ReaderAndWriter;

import java.io.IOException;
import java.io.StringWriter;

public class StringWriterExample {

    public static void main(String[] args) {

        StringWriter writer = null;
        try {
            writer = new StringWriter();

            writer.write("Hello, ");
            writer.append('A');
            writer.write(97);//its converting charecter
            writer.append(" welcome to chennai");

            String writtenString = writer.toString();
            System.out.println("original  content: " + writtenString);

            writer.write("My string:", 0, 8);

            char[] chars = {'a', 'b', 'c'};
            writer.write(chars);
            writer.flush();

            StringBuffer bufferString = writer.getBuffer();
            System.out.println("Buffered String: " + bufferString);
            bufferString.delete(1,20);
            System.out.println("Buffered String: " + bufferString);
            bufferString.insert(0,"virat Kohli ");
            System.out.println("Buffered String: " + bufferString);
            bufferString.reverse();
            System.out.println("Reversed String: " + bufferString);


            int length = writer.getBuffer().length();
            System.out.println("bufferedSize:"+length);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

