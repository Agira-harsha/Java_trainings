package OopsConcepts;
import java.util.Scanner;
public class Circle extends Shape {
    private float radius;
    @Override
    public void acceptInput() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter radius value:");
        radius=scanner.nextFloat();
    }
    @Override
    public void CalculatArea() {
       area=3.141f*radius*radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
