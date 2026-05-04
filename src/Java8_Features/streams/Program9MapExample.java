package Java8_Features.streams;

import java.util.*;
import java.util.stream.*;

class MapExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        List<Integer> result = list.stream()
                .map(i -> i * 10)
                .collect(Collectors.toList());

        System.out.println("Mapped Values: " + result);
    }
}