package Operaters;


import java.math.BigDecimal;
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a firstNumber:");
        String firstNumber=scanner.next();
        System.out.println("enter a secondNumber:");
        String secondNumber=scanner.next();
        try{
            BigDecimal value1=new BigDecimal(firstNumber);
            BigDecimal value2=new BigDecimal(secondNumber);
            System.out.println(value1+" + "+value2+" = "+ value1.add(value2));
            System.out.println(value1+" * "+value2+" = "+ value1.multiply(value2));
            System.out.println(value1+" - "+value2+" = "+ value1.subtract(value2));
            if(value2==BigDecimal.ZERO){

                System.err.println("Not divisible by zero ");
            }
            else{
                System.out.println(value1+" / "+value2+" = "+ value1.divide(value2));
            }

        }
        catch (Exception e){
            System.err.println("Hey You Entered Wrong Number! Try  to Enter Numerics or decimal  Numbers !!");

        }


    }


}

