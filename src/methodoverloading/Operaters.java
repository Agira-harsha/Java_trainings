package methodoverloading;

public class Operaters {

    public void add(int FirstNumber, int secondNumber) {
        System.out.print(FirstNumber + " + " + secondNumber + " = ");
        System.out.println(FirstNumber + secondNumber);
    }

    public double add(int FirstNumber, double secondNumber) {
//        System.out.print(FirstNumber + " + " + secondNumber + " = ");
//        System.out.println((double) (FirstNumber) + secondNumber);
        return (double)FirstNumber + secondNumber;
    }

    public void add(double FirstNumber, double secondNumber) {
        System.out.print(FirstNumber + " + " + secondNumber + " = ");
        System.out.println(FirstNumber + secondNumber);
    }

    public void add(long FirstNumber, double secondNumber) {
        System.out.print(FirstNumber + " + " + secondNumber + " = ");
        System.out.println(FirstNumber + secondNumber);
    }

    public void add(int FirstNumber, long secondNumber) {
        System.out.print(FirstNumber + " + " + secondNumber + " = ");
        System.out.println((long) FirstNumber + secondNumber);

    }

    public void add(double FirstNumber, int secondNumber) {
        System.out.print(FirstNumber + " + " + secondNumber + " = ");
        System.out.println(FirstNumber + (double) secondNumber);
    }

    //minus methods
    public void minus(int FirstNumber, int secondNumber) {
        System.out.print(FirstNumber + " - " + secondNumber + " = ");
        System.out.println(FirstNumber - secondNumber);

    }

    public void minus(int FirstNumber, double secondNumber) {
        System.out.print(FirstNumber + " - " + secondNumber + " = ");
        System.out.println((double) (FirstNumber) - secondNumber);
    }

    public void minus(double FirstNumber, double secondNumber) {
        System.out.print(FirstNumber + " - " + secondNumber + " = ");
        System.out.println(FirstNumber - secondNumber);
    }

    public void minus(long FirstNumber, double secondNumber) {
        System.out.print(FirstNumber + " - " + secondNumber + " = ");
        System.out.println(FirstNumber - secondNumber);
    }

    public void minus(int FirstNumber, long secondNumber) {
        System.out.print(FirstNumber + " - " + secondNumber + " = ");
        System.out.println((long) FirstNumber - secondNumber);

    }

    public void minus(double FirstNumber, int secondNumber) {
        System.out.print(FirstNumber + " - " + secondNumber + " = ");
        System.out.println(FirstNumber - (double) secondNumber);
    }

    //multiply methodas
    public void multiply(int FirstNumber, int secondNumber) {
        System.out.print(FirstNumber + " - " + secondNumber + " = ");
        System.out.println(FirstNumber * secondNumber);

    }

    public void multiply(int FirstNumber, double secondNumber) {
        System.out.print(FirstNumber + " * " + secondNumber + " = ");
        System.out.println((double) (FirstNumber) * secondNumber);
    }

    public void multiply(double FirstNumber, double secondNumber) {
        System.out.print(FirstNumber + " * " + secondNumber + " = ");
        System.out.println(FirstNumber * secondNumber);
    }

    public void multiply(long FirstNumber, double secondNumber) {
        System.out.print(FirstNumber + " * " + secondNumber + " = ");
        System.out.println(FirstNumber * secondNumber);
    }

    public void multiply(int FirstNumber, long secondNumber) {
        System.out.print(FirstNumber + " * " + secondNumber + " = ");
        System.out.println((long) FirstNumber * secondNumber);

    }

    public void multiply(double FirstNumber, int secondNumber) {
        System.out.print(FirstNumber + " * " + secondNumber + " = ");
        System.out.println(FirstNumber * (double) secondNumber);
    }

    //division methods
    public void division(int FirstNumber, int secondNumber) {
        System.out.print(FirstNumber + " / " + secondNumber + " = ");
        System.out.println(FirstNumber / secondNumber);

    }

    public void division(int FirstNumber, double secondNumber) {
        System.out.print(FirstNumber + " / " + secondNumber + " = ");
        System.out.format("%.4f", (double) (FirstNumber) / secondNumber).println();


    }

    public void division(double FirstNumber, double secondNumber) {
        System.out.print(FirstNumber + " / " + secondNumber + " = ");
        System.out.format("%.4f", (double) (FirstNumber) / secondNumber).println();
    }

    public void division(long FirstNumber, double secondNumber) {
        System.out.print(FirstNumber + " / " + secondNumber + " = ");
        System.out.println(FirstNumber / secondNumber);
    }

    public void division(int FirstNumber, long secondNumber) {
        System.out.print(FirstNumber + " / " + secondNumber + " = ");
        System.out.println((long) FirstNumber / secondNumber);

    }

    public void division(double FirstNumber, int secondNumber) {
        System.out.print(FirstNumber + " / " + secondNumber + " = ");
        System.out.println(FirstNumber / (double) secondNumber);
    }

    //mudules
    public void modules(int FirstNumber, int secondNumber) {
        System.out.print(FirstNumber + " % " + secondNumber + " = ");
        System.out.println(FirstNumber % secondNumber);

    }

    public void modules(int FirstNumber, double secondNumber) {
        System.out.print(FirstNumber + " % " + secondNumber + " = ");
        System.out.println((double) (FirstNumber) % secondNumber);
    }

    public void modules(double FirstNumber, double secondNumber) {
        System.out.print(FirstNumber + " % " + secondNumber + " =  ");
        System.out.format("%.4f", FirstNumber % secondNumber);
    }

    public void modules(long FirstNumber, double secondNumber) {
        System.out.print(FirstNumber + " % " + secondNumber + " = ");
        System.out.format("%.4f", FirstNumber % secondNumber);
    }

    public void modules(int FirstNumber, long secondNumber) {
        System.out.print(FirstNumber + " % " + secondNumber + " = ");
        System.out.println((long) FirstNumber % secondNumber);

    }

    public void modules(double FirstNumber, int secondNumber) {
        System.out.print(FirstNumber + " % " + secondNumber + " = ");
        System.out.println(FirstNumber % (double) secondNumber);
    }

}
