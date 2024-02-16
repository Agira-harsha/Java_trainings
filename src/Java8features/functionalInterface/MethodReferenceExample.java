package Java8features.functionalInterface;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("harsha");
        names.add("loga");
        names.add("virat");
        names.add("kohli");
        names.add("David");

        System.out.println("instance method reference");
        MethodReferenceExample example = new MethodReferenceExample();
        names.forEach(example::printName);

        System.out.println("static method reference");
        names.forEach(MethodReferenceExample::displayName);

        System.out.println("using constructer reference:");
        names.forEach(MethodReferenceExample::new);
    }

    public void printName(String name) {
        System.out.println("instance " + name);
    }

    public static void displayName(String name) {
        System.out.println("Static ," + name);
    }

    public MethodReferenceExample(String name) {
        System.out.println("Constructer  " + name);
    }
    public MethodReferenceExample(){

    }
}
