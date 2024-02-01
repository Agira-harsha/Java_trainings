package ExceptionHandlingWays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Applicant {
    private byte age;

    public void acceptAge() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please Enter Your Age:");
            age = scanner.nextByte();
        } catch (InputMismatchException e) {
            System.err.println("Please enter values range values -128 to 127");
        } catch (Exception e) {
            System.err.println("please enter Correct Values");
        }
    }

    public void validation() throws OverAgeException, UnderAgeException {
        if (age >= 18 && age <= 60) {
            String green = "\u001B[32m";
            System.out.println(green + "Please..Collect Your Licence !!!");
        } else if (age < 18) {
            UnderAgeException underAgeException = new UnderAgeException();
            System.err.println(underAgeException.getMessage());
            throw underAgeException;
        } else {
            OverAgeException overAgeException = new OverAgeException();
            System.err.println(overAgeException.getMessage());
            throw overAgeException;
        }

    }
}
