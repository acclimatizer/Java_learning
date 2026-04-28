package a14_abstract_class;

abstract class Operation {
    void msg() {
        // Corrected println spelling and quotes
        System.out.println("hello friends");
    }

    // Abstract method must end with a semicolon
    abstract void twice(int a);
}

class Programmer1 extends Operation {
    @Override
    void twice(int x) {
        System.out.println("result1: " + (x + x));
    }
} // Added missing closing brace

class Programmer2 extends Operation {
    @Override
    void twice(int y) {
        System.out.println("result2: " + (y * 2));
    }
} // Added missing closing brace

class Programmer3 extends Operation {
    @Override
    void twice(int z) {
        // Bitwise left shift (z << 1) effectively multiplies by 2
        System.out.println("result3: " + (z << 1));
    }
} // Added missing closing brace

class AbstractDemo {
    public static void main(String[] args) { // Fixed 'Sting[]' to 'String[]'
        Programmer1 p1 = new Programmer1();
        p1.msg();
        p1.twice(5);

        Programmer2 p2 = new Programmer2(); // Fixed type from Programmer to Programmer2
        p2.msg();
        p2.twice(6);

        Programmer3 p3 = new Programmer3(); // Fixed type from Programmer to Programmer3
        p3.msg();
        p3.twice(8);
    }
}