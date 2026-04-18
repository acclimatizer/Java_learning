package a05_arrays;

class ArrayDemo2 {
    public static void main(String[] args) {
        int[] iarr = {12,34,45,67,89};
        for (int x:iarr){
            System.out.println(x);
        }
        double[] darr = {1.1,2.2,3.3,4.4,5.5,6.6};
        for(double y:darr){
            System.out.println(y);
        }
        char carr[] = {'a','b','c','d'};
        for(char z:carr) {
            System.out.println(z);
        }
    }
}