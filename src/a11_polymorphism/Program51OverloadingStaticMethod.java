package a11_polymorphism;

class OverStatMethod{
    static void show(int x){
        System.out.println("int parameter");
    }
    static void show(double x){
        System.out.println("double parameter");
    }

    public static void main(String[] args) {
        show(12);
        show(1.2);
    }
}