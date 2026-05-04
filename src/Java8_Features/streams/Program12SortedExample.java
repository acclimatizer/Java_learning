package Java8_Features.streams;

import java.util.*;
import java.util.stream.*;

class SortedExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,1,9,3);

        List<Integer> sorted = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted: " + sorted);
    }
}