package Java8features.lamdaExpression;

import Java8features.lamdaExpression.MultipleParamsWithLamda;
import Java8features.lamdaExpression.SingleParameterWithLamda;
import Java8features.lamdaExpression.ZeroParameterWithLamda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LamdaRunner {
    public static void main(String[] args) {
        custom();
    }

    private static void custom() {
        while (true) {
            display();
            Scanner scanner = new Scanner(System.in);
            byte value=0;
            try {
                value = scanner.nextByte();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

            switch (value) {
                case 1:
                    ZeroParameterWithLamda zeroParam = () -> {
                        System.out.println("drawing...");
                        System.out.println("enter the Size of Drawing");
                        int size = 0;
                        try {
                            size = scanner.nextInt();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        for (int i = 1; i <= size * 2 - 1; i++) {
                            for (int j = 1; j <= size * 2 - 1; j++) {
                                if ((i >= j && i <= size) || (i <= size && i + j >= size * 2) || (i > size && i + j <= size * 2) || i > size && j >= i) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println();
                        }
                    };
                    zeroParam.draw();
                    break;
                case 2:
                    SingleParameterWithLamda toUpperCase = str -> str.toUpperCase();
                    System.out.println("Enter a string:");
                    String name = scanner.next();
                    System.out.println("Result after manipulation: " + toUpperCase.manipulate(name));
                    break;

                case 3:
                    MultipleParamsWithLamda addition = (a, b) -> a + b;
                    System.out.println("Enter two numbers:");
                    int num1=0;
                    int num2=0;
                    try {
                        num1 = scanner.nextInt();
                        num2 = scanner.nextInt();
                    }
                    catch (InputMismatchException e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Addition result: " + addition.calculate(num1, num2));
                    break;
                case 4:
                    System.out.println("thank you");
                    System.exit(0);
                default:
                    System.err.println("enter correct option:");
                    custom();


            }
        }
    }

    static void display() {
        System.out.println("functional Interface with different parameters:");
        System.out.println("1.Zero parameter With lamda Expression:");
        System.out.println("2.Single Paramter with lamda Expression:");
        System.out.println("3.Multiple paramter with lamda Expression:");
        System.out.println("4.exit");
    }
}
