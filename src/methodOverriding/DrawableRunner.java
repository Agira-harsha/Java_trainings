package methodOverriding;

public class DrawableRunner {
    public static void main(String[] args) {
        DrawingTool tool = new DrawingTool();
        Square square = new Square(5);
        Triangle triangle=new Triangle(4, 6);
        tool.drawShapes(square);
        tool.drawShapes(triangle);
    }
}