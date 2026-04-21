package a10_inheritance;

class  Cone{
    int x=11;
    void show(){
        System.out.println("cone class show()");
    }
}
class Ctwo extends Cone {
    int y=22;
    void display(){
        System.out.println("ctwo class display()");
    }
}
class Inheritance{
    public static void main(String[] args) {
        Ctwo c = new Ctwo();
        System.out.println(c.x);
        c.show();
        System.out.println(c.y);
        c.display();
    }
}