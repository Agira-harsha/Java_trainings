package Inheritance.hierachical;

import Inheritance.hierachical.Animal;

class Cat extends Animal {
    public Cat(String name) {
        super(name); // Call the superclass constructor
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }
}