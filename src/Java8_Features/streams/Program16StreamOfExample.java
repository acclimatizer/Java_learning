package Java8_Features.streams;

import java.util.stream.*;

class StreamOfExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(10,20,30);

        stream.forEach(System.out::println);
    }
}