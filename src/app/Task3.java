package app;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> temps = new HashMap<>();
        temps.put("Monday", 8);
        temps.put("Tuesday", 10);
        temps.put("Wednesday", 15);
        temps.put("Thursday", 9);
        temps.put("Friday", 14);
        temps.put("Saturday", 11);
        temps.put("Sunday", 13);

        AtomicInteger count = new AtomicInteger(0);
        temps.entrySet()
            .stream()
            .filter(temp -> temp.getValue() >= 10 && temp.getValue() <= 13)
            .forEach(temp -> System.out.println(count.incrementAndGet() + ") " + temp.getKey() + " +" + temp.getValue()));
    }
}
