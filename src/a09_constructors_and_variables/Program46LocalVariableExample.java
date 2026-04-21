package a09_constructors_and_variables;

class LocalVarSample{
    int a = 11;
    static int b = 22;
    void show(){
        int c = 33;
        int d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        d = 44;
        System.out.println(d);
    }

    public static void main(String[] args) {
        LocalVarSample s = new LocalVarSample();
        s.show();
    }
}