package a07_oops_basics;


class Addition4{
    double AddAndReturn(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        Addition4 addnew = new Addition4();
        double result = addnew.AddAndReturn(9.9999,11.4444);
        System.out.println(result);
    }
}