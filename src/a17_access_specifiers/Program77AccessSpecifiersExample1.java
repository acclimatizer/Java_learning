package a17_access_specifiers;

class Sample {
    static Sample s;
    private Sample() {
    }
    void msg() {
        System.out.println("hello friends");
    }
    static Sample getObject() {
        if(s == null)
            s = new Sample();
        return s;
    }
}
class Demo {
    public static void main(String[] args) {
        Sample s = Sample.getObject();
        s.msg();
    }
}