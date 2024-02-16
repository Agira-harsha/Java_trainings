package Java8features.functionalInterface;

import Java8features.functionalInterface.Product;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ProductRunner {
    public static void main(String[] args) {
        // Supplier to generate a list of products
        Supplier<List<Product>> productListSupplier = () -> {
            return Arrays.asList(
                    new Product("Laptop", 10000),
                    new Product("Mobile Phone", 5000),
                    new Product("Headphones", 200),
                    new Product("Tablet", 3000),
                    new Product("Smartwatch", 200)
            );
        };

        Predicate<Product> expensiveProductPredicate = product -> product.getPrice() >= 500;

        Consumer<Product> productConsumer = product -> System.out.println("product : " + product.getName() + " : " + product.getPrice());
        Function<List<Product>, Integer> totalPriceCalculator = products -> {
            int total = 0;
            for (Product product : products) {
                total += (int) product.getPrice();
            }
            return total;
        };

        List<Product> products = productListSupplier.get();

        for (Product product : products) {
            if (expensiveProductPredicate.test(product)) {
                productConsumer.accept(product);
            }
        }
        System.out.println("Total price of all products: " + totalPriceCalculator.apply(products));

    }
}