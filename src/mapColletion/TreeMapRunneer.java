package mapColletion;

import IOStreams.Person;

import java.util.*;

public class TreeMapRunneer {
    public static void main(String[] args) {
        TreeMap<Integer, Product> productTreeMap = new TreeMap<>();
        productTreeMap.put(5, new Product(1, "Laptop", 45553.99));
        productTreeMap.put(1, new Product(2, "Smartphone", 39121.99));
        productTreeMap.put(2, new Product(3, "Headphones", 209.99));
        productTreeMap.put(13, new Product(4, "watch", 233));
        productTreeMap.put(9, new Product(5, "bat", 234));

      for (Map.Entry<Integer, Product> entry : productTreeMap.entrySet()) {
            Product product = entry.getValue();
            System.out.println(entry.getKey() +" "+"ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
        }
    }
}
