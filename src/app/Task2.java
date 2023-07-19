package app;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Task2 {

    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();
        products.put("Cucumber", 1.25);
        products.put("Orange", 3.15);
        products.put("Plum", 1.99);
        products.put("Apple", 2.50);
        products.put("Banana", 3.12);
        products.put("Rice", 1.55);

        AtomicInteger count = new AtomicInteger(0);
        products.entrySet()
            .stream()
            .filter(product -> product.getValue() <= 2)
            .forEach(product -> System.out.println(count.incrementAndGet() + ") " + product.getKey() + " - " + product.getValue()));
    }
}
