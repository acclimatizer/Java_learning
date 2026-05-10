package Java8_Features.predicates;

import java.util.function.Predicate;

public class Program6PredicateNamesStartingWithK {
    public static void main(String[] args) {
        String[] names = {"Sunny", "Kajal", "Mallika", "Katrina", "Kareena"};

        Predicate<String> p = s -> s.charAt(0) == 'K';

        for (String name : names) {
            if (p.test(name)) {
                System.out.println(name);
            }
        }
    }
}