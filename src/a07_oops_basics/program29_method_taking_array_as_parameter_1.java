package a07_oops_basics;

class ArrayDemo{
    void arrayDouble(double[] temp){
        for(double x : temp) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        double[] temperature = {9.3, 7.4, 5.6, 11.7};
        ArrayDemo arr = new ArrayDemo();
        arr.arrayDouble(temperature);
    }
}