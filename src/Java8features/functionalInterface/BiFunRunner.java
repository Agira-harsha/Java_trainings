package Java8features.functionalInterface;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class BiFunRunner {
    public static void main(String[] args) {

        Supplier<List<Product>> productListSupplier = () -> Arrays.asList(
                new Product("Laptop", 10000),
                new Product("Mobile Phone", 5000),
                new Product("Headphones", 100),
                new Product("Tablet", 3000),
                new Product("Smartwatch", 200)
        );

        BiPredicate<Product, Double> expensiveProductPredicate = (product, minPrice) -> product.getPrice() >= minPrice;

        BiConsumer<Product, String> productConsumer = (product, message) -> System.out.println(message + ": " + product.getName() + " - " + product.getPrice());

        BiFunction<List<Product>, Double, Double> totalPriceCalculator = (products, gst) -> {
            double total = 0;
            double gstvalue = 0;
            for (Product product : products) {
                if (expensiveProductPredicate.test(product, gst)) {
                    total = total + product.getPrice();
                    gstvalue = gstvalue + product.getPrice() * gst / 100;
                }
            }
            return total + gstvalue;
        };

        List<Product> products = productListSupplier.get();

        for (Product product : products) {
            if (expensiveProductPredicate.test(product, 500.0)) {
                productConsumer.accept(product, "Expensive Product");
            }
        }

        System.out.println("Total price of all products with GST :" + totalPriceCalculator.apply(products, 3.0));
    }
}
