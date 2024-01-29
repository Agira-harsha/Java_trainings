package OopsConcepts;

//abstraction class
abstract public class Shape {
    float area;

    abstract public void acceptInput();

    abstract public void CalculatArea();

    final public void display() {
        System.out.println("Area of "+getClass().getSimpleName()+" : " + area);
    }


}
