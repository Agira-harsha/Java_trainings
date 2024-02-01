package shoppingMallProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerInfo {
    private String customerName;
    private String address;
    private String gstNumber;
    private String productName;
    private String productDescription;
    private double price;
    private byte quantity;
    private float gstRate;
    private double totalAmount;
    private double gst;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte getQuantity() {
        return quantity;
    }

    public void setQuantity(byte quantity) {
        this.quantity = quantity;
    }

    public float getGstRate() {
        return gstRate;
    }

    public void setGstRate(float gstRate) {
        this.gstRate = gstRate;
    }

    void acceptCustomerDetails() {
        System.out.println("*****  Welcome to My Shopping Mall *****");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer details:");
        System.out.print("Customer Name: ");
        customerName = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("GST Number: ");
        gstNumber = scanner.next();
        if (!(gstNumber.length() == 15)) {
            InvalidGstNumber invalidGstNumber = new InvalidGstNumber();
            System.err.println(invalidGstNumber.getMessage());
            //System.err.println("You Enter Wrong GST Number...!Please Enter 15 digits number! Try again...");
            acceptCustomerDetails();
        }

    }

    void displayCustomerDetails() {
        System.out.println("******  Customer Detials *****\n");
        System.out.println("CustomerName  :" + customerName);
        System.out.println("CutomerAddress :" + address);
        System.out.println("GST Number :" + gstNumber + "\n");
        System.out.println("******  Customer Detials *****\n");

    }

    void acceptProductDetails() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("\nEnter product details:");
            System.out.print("Product name: ");
            productName = scanner.nextLine();
            System.out.print("Description: ");
            productDescription = scanner.nextLine();
            System.out.print("Price : ");
            price = scanner.nextDouble();
            System.out.print("GST rate (%): ");
            gstRate = scanner.nextFloat();
            System.out.print("Quantity: ");
            quantity = scanner.nextByte();
            if (!(quantity > 0)) {
                System.err.println("Enter the positive quantity  value...try again ");
                acceptProductDetails();
            } else if (!(gstRate > 0)) {
                System.err.println("Enter Positive GST Value.... try again!!");
                acceptProductDetails();
            }
        } catch (InputMismatchException e) {

            System.err.println("please enter correct Values .....");
            acceptProductDetails();
        }


    }

    void displayInvoiceBill() {
        String heart = "\u2764\uFE0F" + "\u2764\uFE0F" + "\u2764\uFE0F";

        System.out.println("*********** Your Bill *************** ");
        System.out.println("CustomerName :" + customerName);
        System.out.println("ProductName :" + productName);
        System.out.println("Price :" + price);
        System.out.println("Quantity: " + quantity);
        System.out.print("GST : ");
        System.out.format("%.3f", gst);
        System.out.println();
        System.out.print("TotalAmount :");
        System.out.format("%.3f", totalAmount);
        System.out.println();
        System.out.println(heart + " Thank You For Shopping  " + heart);

    }

    void calculation() {

        System.out.println("please Choose The below Options ..");
        System.out.println("1.Include GST");
        System.out.println("2.Exclude GST");
        Scanner scanner = new Scanner(System.in);

        byte options = 0;
        try {
            options = scanner.nextByte();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }


        switch (options) {
            case 1:
                totalAmount = price * quantity + (price * quantity * gstRate / 100);
                gst = price * quantity * gstRate / 100;
                break;
            case 2:
                totalAmount = price * quantity;
                break;
            default:
                System.err.println("Please Enter Correct option :");
                calculation();
        }
        displayInvoiceBill();//displaying bill
        System.out.println("Do Want To Buy Product  type - (yes or no (type anything):");
        String yes = scanner.next();
        continueShopping(yes);

    }

    void continueShopping(String yes) {
        if (yes.equalsIgnoreCase("yes")) {
            acceptProductDetails();
            calculation();
        } else {
            String heart = "\u2764\uFE0F" + "\u2764\uFE0F" + "\u2764\uFE0F";
            System.out.println(heart + " Visit Again....!Have a Nice Day " + heart);
            System.exit(0);

        }
    }

}




