package Java8_Features.predicates;

import java.util.*;
import java.util.function.Predicate;

public class Program4PredicateCollectionEmpty {
    public static void main(String[] args) {
        Predicate<List<Integer>> p = list -> list.isEmpty();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = List.of(1, 2, 3);

        System.out.println(p.test(list1));
        System.out.println(p.test(list2));
    }
}