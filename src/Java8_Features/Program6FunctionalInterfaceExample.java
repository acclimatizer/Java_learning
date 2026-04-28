package Java8_Features;// Title: Function Example - String Length

import java.util.function.Function;

class FunctionExample {
    public static void main(String[] args) {

        Function<String, Integer> f = s -> s.length();

        System.out.println(f.apply("Java")); // 4
    }
}