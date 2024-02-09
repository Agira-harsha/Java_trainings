package IOStreams;

import IOStreams.Person;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.sql.SQLOutput;

public class ReadingObjectToFile {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream("/home/agira/notes/myObjects.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);

            // Read objects

            Person person1 = (Person) objectInputStream.readObject();
            Person person2 = (Person) objectInputStream.readObject();
            Person person3 = (Person) objectInputStream.readObject();
            Person person4 = (Person) objectInputStream.readObject();
            Person person5 = (Person) objectInputStream.readObject();

            //printing the objects
            System.out.println(person1+"\n");
            System.out.println(person2+"\n");
            System.out.println(person3+"\n");
            System.out.println(person4+"\n");
            System.out.println(person5+"\n");

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
