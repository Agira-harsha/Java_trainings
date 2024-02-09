package ReaderAndWriter;

import java.io.*;

public class BufferReaderExample {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("enter the age:");
            int  age=Integer.parseInt(bufferedReader.readLine());
            System.out.println("enter the name:");
            String name= bufferedReader.readLine();
            System.out.println("enter salary:");
            float salary=Float.parseFloat(bufferedReader.readLine());
            System.out.println("enter The gender Like: M or F");
            char  gender= Character.valueOf((char) bufferedReader.read());
            if(gender =='M' || gender == 'F' || gender =='m' ||gender == 'f'){
                display(name,age,salary,gender);
            }
            else{
                System.out.println("You enter wrong values!!enter like: M or F enter ");
            }
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
    static  void display(String name, int age, float salary, char gender){
        System.out.println("peron details:");
        System.out.println("name: "+name);
        System.out.println("age :"+age);
        System.out.println("salary :"+salary);
        System.out.println("gender :"+gender);

    }
}
