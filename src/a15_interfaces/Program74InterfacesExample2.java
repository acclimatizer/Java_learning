package a15_interfaces;

interface Sample {
    int x = 45;
    void msg();
}

interface Test {
    int y = 99;
    void msg();
}

class InterfaceDemo2 implements Sample, Test {
    public void msg() {
        System.out.println("multiple Inheritance");
    }

    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);

        InterfaceDemo2 id = new InterfaceDemo2();
        id.msg();

        Sample s = new InterfaceDemo2();
        s.msg();

        Test t = new InterfaceDemo2();
        t.msg();
    }
}