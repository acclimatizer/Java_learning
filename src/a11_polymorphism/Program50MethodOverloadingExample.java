package a11_polymorphism;

class MethodOverEx {
    void add(int x,int y){
        System.out.println("Result1 : "+(x+y));
    }
    void add(int x,int y,int z){
        System.out.println("Result2 : "+(x+y+z));
    }
    void add(int x,double y){
        System.out.println("Result3 : "+(x+y));
    }
    void add(double x,int y){
        System.out.println("Result4 : "+(x+y));
    }

    public static void main(String[] args) {
        MethodOverEx ad = new MethodOverEx();
        ad.add(3,4);
        ad.add(3,4,5);
        ad.add(3,4.5);
        ad.add(3.4,5);
    }
}