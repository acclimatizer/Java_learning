package Java8_Features.predicates;

import java.util.function.Predicate;

public class Program3PredicateEvenNumber {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i % 2 == 0;

        System.out.println(p.test(10));
        System.out.println(p.test(15));
    }
}