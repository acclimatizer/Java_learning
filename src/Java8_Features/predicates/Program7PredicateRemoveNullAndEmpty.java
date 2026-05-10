package Java8_Features.predicates;

import java.util.*;
import java.util.function.Predicate;

public class Program7PredicateRemoveNullAndEmpty {
    public static void main(String[] args) {
        String[] names = {"Durga", "", null, "Ravi", "", "Shiva", null};

        Predicate<String> p = s -> s != null && s.length() > 0;

        List<String> list = new ArrayList<>();

        for (String s : names) {
            if (p.test(s)) {
                list.add(s);
            }
        }

        System.out.println(list);
    }
}