package Inheritance.hierachical;

import Inheritance.hierachical.Animal;

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the superclass constructor
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}