package multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Users implements Runnable {
    private String name;
    private int age;
    private String gen;
   public static List<Users> userList = new ArrayList<>();


    public Users(String name, int age, String gen) {
        this.name = name;
        this.age = age;
        this.gen = gen;
    }

    public Users() {

    }

    public void run() {
        Thread thredName = Thread.currentThread();
        String threadName = thredName.getName();
        if (threadName.equals("detail")) {
            details();
        } else if (threadName.equals("Num")){
            printNumbers();
        }
    }

    public  void details() {
        display();
    }

    public  void display() {
        for (Users stall:userList){
            System.out.println("Review your details for any mistakes:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gen);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void printNumbers() {
        System.out.println("Number printing started");

        for (int i=1;i<=10;i++) {
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGen() {
        return gen;
    }
}