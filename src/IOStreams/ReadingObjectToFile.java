package IOStreams;

import IOStreams.Person;

import java.io.*;

public class ReadingObjectToFile {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream(new File("myObjects.txt"));
            objectInputStream = new ObjectInputStream(fileInputStream);

            // Read objects
            Person person1 = (Person) objectInputStream.readObject();
            Person person2 = (Person) objectInputStream.readObject();
            Person person3 = (Person) objectInputStream.readObject();
            //printing the objects
            System.out.println(person1+"\n");
            System.out.println(person2+"\n");
            System.out.println(person3+"\n");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
