package a12_this_super_and_final_keywords;

final class FinalClassExample{
    int x = 12;
    void msg(){
        System.out.println("we are listening");
    }
}

class ChildClass3 {
    public static void main(String[] args) {
        FinalClassExample p = new FinalClassExample();
        p.msg();
        System.out.println(p.x);
        p.x = 34;
        System.out.println(p.x);
    }
}