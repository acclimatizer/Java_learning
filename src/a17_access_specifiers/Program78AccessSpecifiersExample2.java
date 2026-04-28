package a17_access_specifiers;
class Sample1 {
    public void msg() {
        System.out.println("hello friends");
    }
    public static void main(String[] args) {
        Sample1 s = new Sample1();
    }
}
class Demo1 {
    public static void main(String[] args) {
        Sample1 s = new Sample1();
        s.msg();
    }
}

