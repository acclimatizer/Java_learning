package Java8_Features.streams;

import java.util.*;
import java.util.stream.*;

class CountExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jay", "John", "Alex", "Sam");

        long count = names.stream()
                .filter(s -> s.length() > 3)
                .count();

        System.out.println("Names with length > 3: " + count);
    }
}