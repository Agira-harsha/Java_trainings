package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetRunnner {

    static HashSet<Person> personHashSet;

    public static void main(String[] args) {
        personHashSet = new HashSet<>();
        Person person1 = new Person("harsha", "kadapa", (byte) (23));
        Person person2 = new Person("arunkumar", "bihar", (byte) (22));
        Person person3 = new Person("deva", "chennai", (byte) (24));
        Person person4 = new Person("vivek", "bihar", (byte) (25));
        Person person5 = new Person("vivek", "assam", (byte) (25));

        System.out.println("********** hashSet *********");
        personHashSet.add(person1);
        personHashSet.add(person1);
        personHashSet.add(person2);
        personHashSet.add(person3);
        personHashSet.add(person5);
        personHashSet.add(person4);
        personHashSet.add(new Person("vivek", "bihar", (byte) (25)));
        display(personHashSet);

        System.out.println("******** linked Hash set ********");
        LinkedHashSet<Person> personLinkedHashSet = inheritance(personHashSet);
        personLinkedHashSet.removeAll(personLinkedHashSet);
        personLinkedHashSet.add(person1);
        personLinkedHashSet.add(person1);
        personLinkedHashSet.add(person2);
        personLinkedHashSet.add(person3);
        personLinkedHashSet.add(person5);
        personLinkedHashSet.add(person4);
        display(personLinkedHashSet);

        System.out.println("******* tree Set ********");
        TreeSet<Person> personTreeSet = inheritance(personLinkedHashSet);
        display(personTreeSet);
        personTreeSet.add(person4);
        personTreeSet.add(new Person("loga", "chennai", (byte) (19)));
        personTreeSet.add(new Person("loga", "chennai", (byte) (19)));
        personTreeSet.add(person4);
        personTreeSet.add(person5);
        display(personTreeSet);


    }

    static void display(HashSet<Person> person) {
        for (Person people : person) {
            System.out.println(people);
        }
        System.out.println();
    }

    static LinkedHashSet<Person> inheritance(HashSet<Person> list) {
        return new LinkedHashSet<>(list);
    }

    static void display(LinkedHashSet<Person> linkedHashSet) {
        for (Person people : linkedHashSet) {
            System.out.println(people);
        }
        System.out.println();
    }

    static TreeSet<Person> inheritance(LinkedHashSet<Person> likendlist) {
        return new TreeSet<>(likendlist);
    }

    static void display(TreeSet<Person> treeSet) {
        for (Person person : treeSet) {
            System.out.println(person);
        }
        System.out.println();
    }
}

