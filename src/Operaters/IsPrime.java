package Operaters;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your number");
        int value=input.nextInt();
        if(checkValid(value)){
            System.out.println("is Prime number");
        }
        else {
            System.out.println("is not a prime number");
        }

    }
    static  boolean checkValid(int value){
        if(value<=2){
            return  false;

        }
        for(int i=2;i<value;i++){
            if(value%i==0){
                return false;
            }
        }
        return  true;
    }
}
