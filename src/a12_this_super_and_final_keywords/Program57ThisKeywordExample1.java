package a12_this_super_and_final_keywords;

class ThisKeyword{
    int a = 11;
    int b = 22;
    void show(){
        int b = 33;
        int c = 44;
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();
        obj.show();
    }
}