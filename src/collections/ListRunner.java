package collections;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListRunner {
    static ArrayList<Person> personArrayList;

    public static void main(String[] args) {
        personArrayList = new ArrayList<>();
        System.out.println("*********** arrayList ***********");
        Person person1 = new Person("harsha", "kadapa", (byte) (23));
        Person person2 = new Person("arunkumar", "bihar", (byte) (22));
        Person person3 = new Person("deva", "chennai", (byte) (24));
        Person person4 = new Person("vivek", "bihar", (byte) (25));

        personArrayList.add(person1);
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        display(personArrayList);
        personArrayList.remove(0);
        personArrayList.remove(2);
        display(personArrayList);
        personArrayList.add(1, person4);
        display(personArrayList);
        personArrayList.set(2, person3);
        display(personArrayList);

        LinkedList<Person> personLinkedList = inheritance(personArrayList);
        //linked list convertion
        System.out.println("********** linkedList ***********");
        personLinkedList.addFirst(new Person("harini", "chenai", (byte) (22)));
        display(personLinkedList);
        personLinkedList.add(3, person2);
        display(personLinkedList);
        personLinkedList.removeLast();
        personLinkedList.remove(2);

        display(personLinkedList);
        System.out.println(personLinkedList.get(0));

    }

    static void display(ArrayList<Person> person) {
//        for (Person people : person) {
//            System.out.println(people);
//        }
        Iterator<Person> iterator = person.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    static LinkedList<Person> inheritance(ArrayList<Person> list) {
        return new LinkedList<>(list);
    }

    static void display(LinkedList<Person> linkedList) {
        for (Person people : linkedList) {
            System.out.println(people);
        }
        System.out.println();
    }
}
