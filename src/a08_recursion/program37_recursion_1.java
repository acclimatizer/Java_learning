package a08_recursion;

class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        for (int i = 1; i < 10; i++) {
            int res = f.fact(i);
            System.out.println(i + "!= " + res);
        }
    }

    int fact(int n) {
        if (n == 1)
            return 1;
        int x = n * fact(n - 1);
        return x;
    }
}
