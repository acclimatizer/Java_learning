package a13_typecasting;

class TypeCastingExample1{
    void show(){
        System.out.println("parent class show method");
    }
    void display(){
        System.out.println("parent class display method");
    }
}
class ChildExample extends TypeCastingExample1 {
    void show(){
        System.out.println("child class show method");
    }
    void print(){
        System.out.println("child class print method");
    }
}

// Case 1

class TypeCasting1{
    public static void main(String[] args) {
        TypeCastingExample1 p = new TypeCastingExample1();
        p.display();
        p.show();
    }
}

// case 2

/*
class TypeCasting2{
    public static void main(String[] args) {
        ChildExample c = new ChildExample();
        c.show();
        c.display();
        c.print();
    }
}
*/