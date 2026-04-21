package a11_polymorphism;

class Rectangle{
    int length, breadth;
    Rectangle(){
        length = breadth = 3;
    }
    Rectangle(int x){
        length = breadth = x;
    }
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void area(){
        System.out.println("area : "+(length*breadth));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.area();
        Rectangle r2 = new Rectangle(4);
        r2.area();
        Rectangle r3 = new Rectangle(5,6);
        r3.area();
    }
}