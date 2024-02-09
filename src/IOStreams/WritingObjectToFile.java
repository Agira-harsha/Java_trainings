package IOStreams;

import IOStreams.Person;

import java.io.*;

public class WritingObjectToFile {
   static  FileOutputStream fileOutputStream;
    static ObjectOutputStream objectOutputStream;
    public static void main(String[] args)  {
        Person person1 = new Person("sivaji", 30, "Male");
        Person person2 = new Person("sujitha", 25, "female");
        Person person3 = new Person("deva", 34, "male");
        Person person4 = new Person("siva", 34, "male");
        Person person5 = new Person("vimal", 79, "male");
        try {
             fileOutputStream = new FileOutputStream("/home/agira/notes/myObjects.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
            objectOutputStream.writeObject(person3);
            objectOutputStream.writeObject(person4);
            objectOutputStream.writeObject(person5);
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

