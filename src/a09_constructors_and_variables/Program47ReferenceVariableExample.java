package a09_constructors_and_variables;

class RefVarExample{
    int x= 10;
    String s1 = new String("hi");
    static int y = 20;
    static String S2 = new String("hello");

    public static void main(String[] args) {
        int z = 30;
        String s3 = new String("bye");
        RefVarExample e = new RefVarExample();
    }
}