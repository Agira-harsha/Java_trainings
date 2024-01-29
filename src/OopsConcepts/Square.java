package OopsConcepts;

import java.util.Scanner;

public class Square extends Shape{
    private float side;
    @Override
    public void acceptInput() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the square value:");
        side=scanner.nextFloat();
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public void CalculatArea() {
        area=side*side;
    }

}

