package IOStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCreationDynamic {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("enter The file  name :Example ->list.txt");
        File file = new File(new Scanner(System.in).next());
        PrintWriter writer = new PrintWriter(file);
        System.out.println("start writig.....");
       Scanner scanner=  new Scanner(System.in);
       String data= scanner.nextLine();
        writer.print(data);
        writer.close();
        System.out.println("done");
    }
}
