package Java8_Features.predicates;

import java.util.function.Predicate;

public class Program2PredicateStringLength {
    public static void main(String[] args) {
        Predicate<String> p = s -> s.length() > 3;

        System.out.println(p.test("Java"));
        System.out.println(p.test("Hi"));
    }
}