package Java8_Features.streams;

import java.util.*;
import java.util.stream.*;

class FilterMapExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        List<Integer> result = list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .collect(Collectors.toList());

        System.out.println("Filtered + Mapped: " + result);
    }
}