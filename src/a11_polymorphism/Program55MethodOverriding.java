package a11_polymorphism;

class Parent{
    void msg() {
        System.out.println("good morning");
    }
}
class Child extends Parent{
    void msg(){
        System.out.println("good night");
    }
}
class Polymorphism{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.msg();
        Child C = new Child();
        C.msg();
        Parent p1 = new Child();
        p1.msg();
    }
}