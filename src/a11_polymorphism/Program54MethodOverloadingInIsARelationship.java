package a11_polymorphism;


class OverloadIsARelation{
    void show(int x){
        System.out.println("int value");
    }
}
class OverloadIsARelation2 extends OverloadIsARelation{
    void show(char x){
        System.out.println("char value");
    }
}
class CheckingResult{
    public static void main(String[] args) {
        OverloadIsARelation2 obj = new OverloadIsARelation2();
        obj.show(2);
    }
}