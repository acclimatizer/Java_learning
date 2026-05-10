package Java8_Features.predicates;

import java.util.function.Predicate;

public class Program5PredicateJoiningNumbers {
    public static void main(String[] args) {
        int[] x = {0, 5, 10, 15, 20, 25, 30};

        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i % 2 == 0;

        System.out.println("Greater than 10:");
        print(p1, x);

        System.out.println("Even numbers:");
        print(p2, x);

        System.out.println("Not greater than 10:");
        print(p1.negate(), x);

        System.out.println("Greater than 10 AND even:");
        print(p1.and(p2), x);

        System.out.println("Greater than 10 OR even:");
        print(p1.or(p2), x);
    }

    static void print(Predicate<Integer> p, int[] x) {
        for (int n : x) {
            if (p.test(n)) {
                System.out.println(n);
            }
        }
    }
}