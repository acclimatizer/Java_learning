package Java8_Features;


interface Add {
    int sum(int a, int b);
}
class LambdaExample {
    public static void main(String[] args) {

        Add a = (x, y) -> x + y;

        System.out.println("Sum: " + a.sum(5, 10));
    }
}