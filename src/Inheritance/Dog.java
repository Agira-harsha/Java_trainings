package Inheritance;

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the superclass constructor
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}