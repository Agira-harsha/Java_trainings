package Operaters;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the year");
        int year = sc.nextInt();
        boolean leap = isLeapYear(year);
        if (leap) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }
    static boolean isLeapYear(int year) {
        if (year < 1 || year % 4 != 0) {
            return false;

        } else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        else {
            return true;
        }

    }

}
