package Java8_Features.streams;

import java.util.*;

class MinMaxExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,5,30);

        int min = list.stream().min(Integer::compareTo).get();
        int max = list.stream().max(Integer::compareTo).get();

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}