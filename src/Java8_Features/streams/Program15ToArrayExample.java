package Java8_Features.streams;

import java.util.*;

class ToArrayExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        Integer[] arr = list.stream().toArray(Integer[]::new);

        System.out.println(Arrays.toString(arr));
    }
}