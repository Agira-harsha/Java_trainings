package Operaters;

import java.util.Scanner;

public class Validation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter FirstNumber:");
        //first value
        byte byteFirsteValue = 0;
        short shortFirstValue = 0;
        int integerFirstValue = 0;
        long longFistValue = 0;
        double doubleFirstValue = 0;
        //second value
        byte byteSecondValue = 0;
        short shortSecondValue = 0;
        int integerSecondValue = 0;
        long longSecondValue = 0;
        double doubleSecondValue = 0;
        ///checking the values wheather entered is which type depends upon its assiging the values
//        if (scanner.hasNextByte()) {
//            byteFirsteValue = scanner.nextByte();
//        } else if (scanner.hasNextShort()) {
//            shortFirstValue = scanner.nextShort();
//            ;
        if (scanner.hasNextInt()) {
            integerFirstValue = scanner.nextInt();
        } else if (scanner.hasNextLong()) {
            longFistValue = scanner.nextLong();
        } else if (scanner.hasNextDouble()) {
            doubleFirstValue = scanner.nextDouble();
        } else if (scanner.hasNext()) {
            System.err.println("Hey You Entered Wrong Number! Try  to Enter Numerics or decimal  Numbers !!");
            System.exit(0);
        }
        //second value checking  and assising
        System.out.println("enter secondNumber");
         if (scanner.hasNextInt()) {
            integerSecondValue = scanner.nextInt();
        } else if (scanner.hasNextLong()) {
            longSecondValue = scanner.nextLong();
        } else if (scanner.hasNextDouble()) {
            doubleSecondValue = scanner.nextDouble();
        } else if (scanner.hasNext()) {
            System.err.println("Hey You Entered Wrong Number! Try  to Enter Numerics or decimal  Numbers !!");
            System.exit(0);
        }
        Operaters cal = new Operaters();
         if(integerFirstValue ==0 && longFistValue ==0 && doubleFirstValue==0){
             System.err.println("please enter first the Value");
         }
         else if(integerSecondValue ==0 && longSecondValue ==0 && doubleSecondValue ==0){
             System.err.println("please enter the second  value");
         }

        //Calling add methods
        if (integerFirstValue != 0 && integerSecondValue != 0) {
            cal.add(integerFirstValue, integerSecondValue);
        } else if (integerFirstValue != 0 && doubleSecondValue != 0) {
            cal.add(integerFirstValue, doubleSecondValue);
        } else if (doubleFirstValue != 0 && integerSecondValue != 0) {
            cal.add(doubleFirstValue, integerSecondValue);
        } else if (doubleFirstValue != 0 && doubleSecondValue != 0) {
            cal.add(doubleFirstValue, doubleSecondValue);

        } else if (longFistValue != 0 && doubleSecondValue != 0) {
            cal.add(longFistValue, doubleSecondValue);
        }


        //minus methods calling
        if (integerFirstValue != 0 && integerSecondValue != 0) {
            cal.minus(integerFirstValue, integerSecondValue);
        } else if (integerFirstValue != 0 && doubleSecondValue != 0) {
            cal.minus(integerFirstValue, doubleSecondValue);
        } else if (doubleFirstValue != 0 && integerSecondValue != 0) {
            cal.minus(doubleFirstValue, integerSecondValue);
        } else if (doubleFirstValue != 0 && doubleSecondValue != 0) {
            cal.minus(doubleFirstValue, doubleSecondValue);

        } else if (longFistValue != 0 && doubleSecondValue != 0) {
            cal.minus(longFistValue, doubleSecondValue);
        }
        //calling the mulitply methods
        if (integerFirstValue != 0 && integerSecondValue != 0) {
            cal.multiply(integerFirstValue, integerSecondValue);
        } else if (integerFirstValue != 0 && doubleSecondValue != 0) {
            cal.multiply(integerFirstValue, doubleSecondValue);
        } else if (doubleFirstValue != 0 && integerSecondValue != 0) {
            cal.multiply(doubleFirstValue, integerSecondValue);
        } else if (doubleFirstValue != 0 && doubleSecondValue != 0) {
            cal.multiply(doubleFirstValue, doubleSecondValue);

        } else if (longFistValue != 0 && doubleSecondValue != 0) {
            cal.multiply(longFistValue, doubleSecondValue);
        }

        //calling divisionsmethods
        if (integerFirstValue != 0 && integerSecondValue != 0) {
            cal.division(integerFirstValue, integerSecondValue);
        } else if (integerFirstValue != 0 && doubleSecondValue != 0) {
            cal.division(integerFirstValue, doubleSecondValue);
        } else if (doubleFirstValue != 0 && integerSecondValue != 0) {
            cal.division(doubleFirstValue, integerSecondValue);
        } else if (doubleFirstValue != 0 && doubleSecondValue != 0) {
            cal.division(doubleFirstValue, doubleSecondValue);

        } else if (longFistValue != 0 && doubleSecondValue != 0) {
            cal.division(longFistValue, doubleSecondValue);
        }

        //calling the modules methods
        if (integerFirstValue != 0 && integerSecondValue != 0) {
            cal.modules(integerFirstValue, integerSecondValue);
        } else if (integerFirstValue != 0 && doubleSecondValue != 0) {
            cal.modules(integerFirstValue, doubleSecondValue);
        } else if (doubleFirstValue != 0 && integerSecondValue != 0) {
            cal.modules(doubleFirstValue, integerSecondValue);
        } else if (doubleFirstValue != 0 && doubleSecondValue != 0) {
            cal.modules(doubleFirstValue, doubleSecondValue);

        } else if (longFistValue != 0 && doubleSecondValue != 0) {
            cal.modules(longFistValue, doubleSecondValue);
        }


        //checking


    }
}
