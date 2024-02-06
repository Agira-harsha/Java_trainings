package IOStreams;

import IOStreams.Person;

import java.io.*;

public class WritingObjectToFile {
   static  FileOutputStream fileOutputStream=null;
    static ObjectOutputStream objectOutputStream=null;
    public static void main(String[] args)  {
        Person person1 = new Person("sivaji", 30, "Male");
        Person person2 = new Person("sujitha", 25, "female");
        Person person3 = new Person("deva", 34, "male");
        try {
             fileOutputStream = new FileOutputStream(new File("myObjects.txt"));
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
            objectOutputStream.writeObject(person3);
            objectOutputStream.flush();
            System.out.println("Objects Has been sent successfully");


        } catch (FileNotFoundException e) {
            System.err.println("File Was not Found");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}

