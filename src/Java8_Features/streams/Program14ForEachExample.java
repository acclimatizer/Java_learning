package Java8_Features.streams;

import java.util.*;

class ForEachExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C");

        list.stream().forEach(s -> System.out.println(s));
    }
}