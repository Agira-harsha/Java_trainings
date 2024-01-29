package OopsConcepts;

public class ShapesRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();
        ShapeEvalution result = new ShapeEvalution();
        //methodoverloading for its true Polymorphism
        result.evalution(rectangle);
        result.evalution(square);
        result.evalution(circle);
    }

}
