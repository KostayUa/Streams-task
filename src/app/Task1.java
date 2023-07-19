package app;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Amy");
        names.add("John");
        names.add("Tim");
        names.add("Alex");

        AtomicInteger count = new AtomicInteger(0);
        names.stream()
            .filter(str -> str.startsWith("T"))
            .forEach(name -> System.out.println(count.incrementAndGet() + ") " + name));
    }
}
