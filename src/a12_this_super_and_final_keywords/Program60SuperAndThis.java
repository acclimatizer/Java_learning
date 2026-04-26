package a12_this_super_and_final_keywords;

class DemoOne{
    DemoOne() {
        System.out.println("demo zero constructor");
    }
    DemoOne(int x){
        this();
        System.out.println("demo para constructor");
    }
}
class SampleOne extends DemoOne {
    SampleOne(){
        this(8);
        System.out.println("sample xero constructor");
    }
    SampleOne(int x){
        super(9);
        System.out.println("sample para constructor");
    }

    public static void main(String[] args) {
        SampleOne S = new SampleOne();
    }
}