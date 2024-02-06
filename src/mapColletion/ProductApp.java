package mapColletion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ProductApp {
    static PrintWriter printWriter = null;
    static Map<Integer, Product> products = null;

    public static void main(String[] args) {
        products = new HashMap<>(); // Map to store products by ID

        // Add some sample products
        products.put(1, new Product(1, "Laptop", 45553.99));
        products.put(2, new Product(2, "Smartphone", 39121.99));
        products.put(3, new Product(3, "Headphones", 209.99));

        try {
            printWriter = new PrintWriter(new File("ProductData.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        options();
    }

    // Helper methods for product operations
    static void viewAllProducts(Map<Integer, Product> products) {
        System.out.println("\nAvailable Products:");
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            Product product = entry.getValue();
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
        }
    }

    static void searchProductById(Map<Integer, Product> products) {
        System.out.print("Enter product ID to search: ");
        try {
            int productId = new Scanner(System.in).nextInt();

            Product product = products.get(productId);
            if (product != null) {
                System.out.println("Product found: " + product);
            } else {
                System.out.println("Product not found with ID: " + productId);
            }
        } catch (InputMismatchException e) {
            System.err.println("please enter numbers :");
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
    }

    static void addProduct(Map<Integer, Product> products) {
        System.out.print("Enter product ID: ");
        try {
            int productId = new Scanner(System.in).nextInt();
            if (products.containsKey(productId)) {
                System.out.println("Product with ID " + productId + " already exists.");
                return;
            }
            System.out.print("Enter product name: ");
            String productName = new Scanner(System.in).nextLine();
            System.out.print("Enter product price: $");
            double productPrice = new Scanner(System.in).nextDouble();
            Product product = new Product(productId, productName, productPrice);
            products.put(productId, product);
            printWriter.println(product.getClass().getSimpleName());
            printWriter.println("ID: " + productId + ", Name: " + productName + ", Price: " + productPrice);
            printWriter.flush();
            System.out.println("Product added successfully!");
        } catch (InputMismatchException e) {
            System.err.println("please enter correct values !!!");
        } catch (Exception e1) {
            System.err.println(e1.getMessage());
        }
    }

    static void updateProductPrice(Map<Integer, Product> products) {
        System.out.print("Enter product ID to update price: ");
        int productId = 0;
        try {
            productId = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        Product product = products.get(productId);
        if (product != null) {
            System.out.print("Enter new price: $");
            double newPrice = new Scanner(System.in).nextDouble();
            product.setPrice(newPrice);
            System.out.println("Product price updated successfully!");
        } else {
            System.out.println("Product not found with ID: " + productId);
        }
    }

    static void removeProduct(Map<Integer, Product> products) {

        System.out.print("Enter product ID to remove: ");
        int productId = 0;
        try {
            productId = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.err.println("please enter Integer values");
        }
        Product removedProduct = products.remove(productId);
        if (removedProduct != null) {
            System.out.println("Product removed successfully: " + removedProduct);
        } else {
            System.out.println("Product not found with ID: " + productId);
        }

    }

    static void storeDataIntoFile(Map<Integer, Product> products) {

        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            Product product = entry.getValue();
            printWriter.println(product.getClass().getSimpleName());
            printWriter.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
            printWriter.flush();

        }
    }

    static void options() {
        while (true) {
            System.out.println("\nProduct Menu:");
            System.out.println("1. View All Products");
            System.out.println("2. Search Product by ID");
            System.out.println("3. Add Product");
            System.out.println("4. Update Product Price");
            System.out.println("5. Remove Product");
            System.out.println("6. Store pruducts into a file ");
            System.out.println("7. Exit");

            int choice = 0;
            try {
                choice = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.err.println("please enter numeric values !!");
            }
//            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:

                    viewAllProducts(products);
                    break;
                case 2:
                    searchProductById(products);
                    break;
                case 3:
                    addProduct(products);
                    break;
                case 4:
                    updateProductPrice(products);
                    break;
                case 5:
                    removeProduct(products);
                    break;
                case 6:
                    storeDataIntoFile(products);
                    System.out.println("data has stored Successfully ");
                    break;
                case 7:
                    System.out.println("Exiting...Thank You");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }

        }

    }


}



