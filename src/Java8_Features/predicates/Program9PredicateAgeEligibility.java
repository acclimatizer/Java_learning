package Java8_Features.predicates;

import java.util.function.Predicate;

public class Program9PredicateAgeEligibility {
    public static void main(String[] args) {
        Predicate<Integer> p = age -> age >= 18;

        int[] ages = {12, 17, 18, 21};

        for (int age : ages) {
            if (p.test(age)) {
                System.out.println(age + " Eligible");
            } else {
                System.out.println(age + " Not Eligible");
            }
        }
    }
}