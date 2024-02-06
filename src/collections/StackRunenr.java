package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class StackRunenr {
    static Stack<Person> stackPerson;
    public static void main(String[] args) {
        stackPerson = new Stack<>();
        Person person1 = new Person("harsha", "kadapa", (byte) (23));
        Person person2 = new Person("arunkumar", "bihar", (byte) (22));
        Person person3 = new Person("deva", "chennai", (byte) (24));
        Person person4 = new Person("vivek", "bihar", (byte) (25));
        stackPerson.push(person1);
        stackPerson.push(person2);
        stackPerson.push(person3);
        stackPerson.push(person4);
        display(stackPerson);

        stackPerson.pop();
        System.out.println(" *** it removes last object ****");
        display(stackPerson);



    }
    static void display(Stack<Person> stackPerson){
//        Iterator<Person> iterator = stackPerson.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        Enumeration<Person> element = stackPerson.elements();
        while(element.hasMoreElements()){
            System.out.println(element.nextElement());
        }
    }
}
