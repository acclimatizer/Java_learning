package a12_this_super_and_final_keywords;

class FinalMethodExample{
    final void msg(){
        System.out.println("we are listening");
    }
}
class ChildMethod extends FinalMethodExample {
    public static void main(String[] args) {
        System.out.println("we are sleeping");
    }
}