// Title: Constructor Reference Example

interface MyInterface {
    Sample get(String s);
}

class Sample {
    Sample(String s) {
        System.out.println("Constructor: " + s);
    }
}

class ConstructorRefExample {
    public static void main(String[] args) {

        MyInterface obj = Sample::new;
        obj.get("Hello");
    }
}