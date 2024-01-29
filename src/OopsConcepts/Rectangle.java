package OopsConcepts;

import java.util.Scanner;

public class Rectangle extends Shape {
    private float length;
    private float width;

    @Override
    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length value:");
        length = scanner.nextFloat();
        System.out.println("Please enter the width value:");
        width = scanner.nextFloat();
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public void CalculatArea() {
        area=length*width;
    }
}
