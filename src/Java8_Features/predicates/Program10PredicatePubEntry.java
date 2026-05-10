package Java8_Features.predicates;

import java.util.function.Predicate;

class SoftwareEngineer {
    String name;
    int age;
    boolean hasGf;

    SoftwareEngineer(String n, int a, boolean g) {
        name = n;
        age = a;
        hasGf = g;
    }

    public String toString() {
        return name;
    }
}

public class Program10PredicatePubEntry {
    public static void main(String[] args) {
        SoftwareEngineer[] list = {
                new SoftwareEngineer("Durga", 60, false),
                new SoftwareEngineer("Sunil", 25, true),
                new SoftwareEngineer("Ravi", 17, true)
        };

        Predicate<SoftwareEngineer> p =
                se -> se.age >= 18 && se.hasGf;

        for (SoftwareEngineer se : list) {
            if (p.test(se)) {
                System.out.println(se);
            }
        }
    }
}