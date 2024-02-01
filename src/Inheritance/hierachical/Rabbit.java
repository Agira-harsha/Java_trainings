package Inheritance.hierachical;

public class Rabbit extends  Animal {

    public Rabbit(String name) {
        super(name);
    }

    public void running(){
        System.out.println(name+ "is running so fast !!");
    }
}
