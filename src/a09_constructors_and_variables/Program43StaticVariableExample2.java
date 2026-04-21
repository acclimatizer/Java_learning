package a09_constructors_and_variables;

class SampleStatic{
    int x = 11;
    static int y = 22;
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
    static void display() {
        // System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        SampleStatic s = new SampleStatic();
        s.show();
        SampleStatic.display();;
    }
}