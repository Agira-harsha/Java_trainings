package multithread;

import java.util.Scanner;

public class userRuner {
    public static void main(String[] args) {
        System.out.println("BakeryRunner Thread Excueting..");

        Users.userList.add(getUserDetails());
        Users.userList.add(getUserDetails());

        Thread userThread = new Thread(Users.userList.get(0));
        Thread user2Thread = new Thread(Users.userList.get(1));
        userThread.setName("detail");
        user2Thread.setName("Num");
        
        userThread.start();
        user2Thread.start();

        try {
            userThread.join();
            user2Thread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("All user thread are Excuted..");
    }

    public static Users getUserDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details");
        System.out.println("Enter Name:");
        String name = sc.next();
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        System.out.println("Choose Gender:");
        System.out.println("1. Men or 2. Women");
        System.out.println("Enter Number to choose:");
        int choose = sc.nextInt();
        String gen;
        if (choose == 1) {
            gen = "men";
        } else if (choose == 2) {
            gen = "women";
        } else {
            System.out.println("Wrong choice entered. Please choose the correct option!");
            return null;
        }
        return new Users(name, age, gen);
    }
}