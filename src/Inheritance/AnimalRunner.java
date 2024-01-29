package Inheritance;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog dog = new Dog("Fido");
        dog.eat();
        dog.bark();

        Cat cat = new Cat("Whiskers");
        cat.eat();
        cat.meow();
    }
}