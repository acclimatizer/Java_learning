package Java8_Features;// Title: Predicate Example - Check > 10

import java.util.function.Predicate;

public class Program4PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> p = x -> x > 10;

        System.out.println(p.test(5));   // false
        System.out.println(p.test(20));  // true
    }
}