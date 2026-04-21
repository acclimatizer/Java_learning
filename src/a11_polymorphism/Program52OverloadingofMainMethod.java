package a11_polymorphism;

class OverloadMainMethod{
    public static void main(String[] args) {
        System.out.println("string array");
    }

    public static void main(String args) {
        System.out.println("string parameter");
    }

    public static void main(int args) {
        System.out.println("int array");
    }
}