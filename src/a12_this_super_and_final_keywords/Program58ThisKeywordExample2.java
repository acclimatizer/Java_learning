package a12_this_super_and_final_keywords;

class ThisKeyword2{
    ThisKeyword2() {
        this(8);
        System.out.println("sample zero constructor");
    }
    ThisKeyword2(int x) {
        System.out.println("sample int constructor");
    }
    ThisKeyword2(double y) {
        this();
        System.out.println("sample double constructor");
    }

    public static void main(String[] args) {
        ThisKeyword2 Key = new ThisKeyword2(2.5);
    }
}