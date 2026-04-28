package Java8_Features;// Title: Functional Interface Example

@FunctionalInterface
interface MyInterface {
    void display();
}

class FunctionalInterfaceExample {
    public static void main(String[] args) {

        MyInterface obj = () -> System.out.println("Hello from Lambda");

        obj.display();
    }
}