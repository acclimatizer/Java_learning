package a12_this_super_and_final_keywords;

class SuperImpliedExample{
    int a = 33;
    int b = 44;
}
class Implied1 extends SuperImpliedExample{
    int a = 33;
    int b = 44;
    void m1(){
        System.out.println("demo class m1");
    }
}
class Implied2 extends Implied1{
    int a = 55;
    int b = 66;
    void m2(){
        System.out.println("demo class m2");
    }
    void m3(){
        System.out.println("demo class m3");
    }
    void show(){
        int a = 77;
        int c = 88;
        SuperImpliedExample sup = new SuperImpliedExample();
        System.out.println(sup.a);
        System.out.println(b);
        System.out.println(super.a);
        System.out.println(c);
        System.out.println(this.a);
        // System.out.println(d);
        System.out.println(a);
        // System.out.println(e);
        m1();
        // super.m2();
        m2();
        m3();
    }

    public static void main(String[] args) {
        Implied2 imp = new Implied2();
        imp.show();
    }
}
