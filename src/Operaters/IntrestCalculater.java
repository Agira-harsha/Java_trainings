package Operaters;

import java.math.BigDecimal;
import java.util.Scanner;




public class IntrestCalculater {
    BigDecimal principle;
    BigDecimal intrest;

    public IntrestCalculater(BigDecimal principle, BigDecimal intrest) {
        this.principle = principle;
        this.intrest = intrest.divide(new BigDecimal(100));
    }

    public BigDecimal calculate(int noOfYears) {
        BigDecimal totalValue = principle.add(principle.multiply(intrest).multiply(new BigDecimal(noOfYears)));
        return totalValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the princple amout:");
        String principle = sc.nextLine();
        System.out.println("enter the intrest :");
        String intrest = sc.next();
        System.out.println("enter the years");
        int years = sc.nextInt();
        BigDecimal value1 = new BigDecimal(principle);
        BigDecimal value2=new BigDecimal(intrest);


        IntrestCalculater calculater = new IntrestCalculater(value1, value2);
        System.out.println("total Amout:"+calculater.calculate(years));


    }

}

