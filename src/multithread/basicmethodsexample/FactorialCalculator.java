package multithread.basicmethodsexample;

public class FactorialCalculator implements Runnable{
    private String name;
    private int number;

    public FactorialCalculator(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void run() {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(i);
            if(i<number) System.out.print("*");
            if (i>number-1) System.out.print( ":");
            factorial *= i;
        }
        System.out.println(name + ": Factorial of " + number + " is " + factorial);
    }
}
