package Inheritance.hierachical;


public class AnimalRunner {
    public static void main(String[] args) {
        Dog dog = new Dog("dog");
        dog.eat();
        dog.bark();

        Cat cat = new Cat("cat");
        cat.eat();
        cat.meow();

        Rabbit rabbit=new Rabbit("rabbit");
        rabbit.eat();
        rabbit.running();
    }
}