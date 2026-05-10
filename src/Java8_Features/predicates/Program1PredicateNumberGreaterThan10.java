package Java8_Features.predicates;

import java.util.function.Predicate;

public class Program1PredicateNumberGreaterThan10 {
    public static void main(String[] args) {
        Predicate<Integer> isGreaterThan10 = i -> i > 10;

        System.out.println(isGreaterThan10.test(100));
        System.out.println(isGreaterThan10.test(7));
    }
}