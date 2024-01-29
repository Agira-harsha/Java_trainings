package OopsConcepts;

public class ShapeEvalution {
    //Polymorphism
    public  void evalution(Shape ref){
        ref.acceptInput();
        ref.CalculatArea();
        ref.display();
    }
}
