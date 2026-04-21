package a09_constructors_and_variables;

class Access1 {

    int x = 11;
    static int y =22;
    void m1(){
        System.out.println("instance method m1");
    }
    void m2(){
        System.out.println(x);
        m1();
        System.out.println(y);
        m3();
        System.out.println("instance method m2");
    }
    static void m3(){
        System.out.println("instance method m3");
    }

    public static void main(String[] args) {
        System.out.println(y);
        m3();
        Access1 a = new Access1();
        System.out.println(a.x);
        a.m2();
    }
}


class Access2{
    void m4(){
        Access1 c = new Access1();
        System.out.println(c.x);
        c.m1();
        System.out.println(Access1.y);
        c.m3();
        System.out.println("instance method m3");
    }

    public static void main(String[] args) {
        Access1 d = new Access1();
        System.out.println(Access1.y);
        d.m3();
        System.out.println(d.x);
        d.m1();
        Access2 b = new Access2();
        b.m4();
    }
}