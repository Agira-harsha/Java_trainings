package OopsConcepts;

import java.util.Scanner;

public class CustomerDetails {
    // Encapsulated fields
    private String name;
    private int age;

    // Default constructor
    public CustomerDetails() {
        this.name = "Unknown";
        this.age = 0;
    }
    // Constructor with name parameter
    public CustomerDetails(String name) {
        this.name = name;
        this.age = 0; // Default age
    }
    // Constructor with both name and age parameters
    public CustomerDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    // Getter for age
    public int getAge() {
        return age;
    }
    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.err.println("Age can't be negative.");
        }
    }
    // Display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public void updateInfo(String name,byte age){
        setName(name);
        setAge(age);
    }
    public void scanner(){
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("please enter correct name:");
            String name=scanner.nextLine();
            System.out.println("please enter correct age:");
            byte age= scanner.nextByte();
            updateInfo(name,age);
            scanner.close();
        }
        catch ( Exception e){
            System.err.println("please enter correct  input ?");
            System.err.println("restart the program!! again ");
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        // Using overloaded constructors
        CustomerDetails person1 = new CustomerDetails();
        CustomerDetails person2 = new CustomerDetails("harsha");
        CustomerDetails person3 = new CustomerDetails("arun kumar", 25);

        // Displaying information
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("\nPerson 2:");
        person2.displayInfo();

        System.out.println("\nPerson 3:");
        person3.displayInfo();
        // Using setter to updates the existing values of an object
        person1.scanner();
        System.out.println("\nUpdated Person 1:");
        person1.displayInfo();
        person2.scanner();
        System.out.println("\nUpdated Person 2:");
        person2.displayInfo();



    }
}



