package a07_oops_basics;

class Add2Doubles{
    void AdditionDoubles(double x,double y){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        double a = 3.5;
        double b = 2.8;
        Add2Doubles adddou = new Add2Doubles();
        adddou.AdditionDoubles(a,b);
    }
}