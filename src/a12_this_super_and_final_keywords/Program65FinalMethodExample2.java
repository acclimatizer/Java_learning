package a12_this_super_and_final_keywords;

class FinalMethodExample2{
    final void msg(){
        System.out.println("we are listening");
    }
}
class ChildMethod2 extends FinalMethodExample2 {
    public static void main(String[] args) {
        ChildMethod2 c = new ChildMethod2();
        c.msg();
    }
}