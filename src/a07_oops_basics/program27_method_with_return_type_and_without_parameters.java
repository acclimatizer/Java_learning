package a07_oops_basics;

class AddDoublesInClass{
    double AdditionInClass(){
        double a = 8.3;
        double b = 13.9;
        double c = a+b;
        return c;
    }

    public static void main(String[] args) {
        AddDoublesInClass addic = new AddDoublesInClass();
        double res = addic.AdditionInClass();
        System.out.println(res);
    }
}