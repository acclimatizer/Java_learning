package Java8_Features;// Title: Predicate Combining Example

import java.util.function.Predicate;

class PredicateCombine {
    public static void main(String[] args) {

        Predicate<Integer> greaterThan10 = x -> x > 10;
        Predicate<Integer> even = x -> x % 2 == 0;

        System.out.println(greaterThan10.and(even).test(20)); // true
        System.out.println(greaterThan10.or(even).test(8));   // true
        System.out.println(greaterThan10.negate().test(5));   // true
    }
}