package Java8_Features.predicates;

import java.util.*;
import java.util.function.Predicate;

class Employee {
    String name, designation, city;
    double salary;

    Employee(String n, String d, double s, String c) {
        name = n;
        designation = d;
        salary = s;
        city = c;
    }

    public String toString() {
        return name + " " + designation + " " + salary + " " + city;
    }
}

public class Program11PredicateEmployeeManagement {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Durga","CEO",30000,"Hyd"));
        list.add(new Employee("Sunny","Manager",20000,"Hyd"));
        list.add(new Employee("Mallika","Manager",20000,"Bangalore"));

        Predicate<Employee> p1 = e -> e.designation.equals("Manager");
        Predicate<Employee> p2 = e -> e.city.equals("Bangalore");

        for (Employee e : list) {
            if (p1.and(p2).test(e)) {
                System.out.println(e);
            }
        }
    }
}