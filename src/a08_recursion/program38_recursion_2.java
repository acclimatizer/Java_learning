package a08_recursion;

class FibonacciSeries{
    int fibonacci(int n) {
        if((n==0)||(n==1))
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        FibonacciSeries fs = new FibonacciSeries();
        for(int i=0;i<=10;i++){
            int res = fs.fibonacci(i);
            System.out.println("Fibonacci of "+i+" is "+res);
        }
    }
}

