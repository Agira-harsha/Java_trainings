package mapColletion;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapRunner {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Product> ProductLinkedHashMap = new LinkedHashMap<>();
        ProductLinkedHashMap.put(5, new Product(1, "Laptop", 45553.99));
        ProductLinkedHashMap.put(1, new Product(2, "Smartphone", 39121.99));
        ProductLinkedHashMap.put(2, new Product(3, "Headphones", 209.99));
        ProductLinkedHashMap.put(13, new Product(4, "watch", 233));
        ProductLinkedHashMap.put(9, new Product(5, "bat", 234));

        for (Map.Entry<Integer, Product> entry : ProductLinkedHashMap.entrySet()) {
            Product product = entry.getValue();
            System.out.println(entry.getKey() +" "+"ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
        }

    }
}
