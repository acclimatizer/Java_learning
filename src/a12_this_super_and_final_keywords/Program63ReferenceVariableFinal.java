package a12_this_super_and_final_keywords;

class ReferenceVariableFinal{
    int a = 11;
    int b = 22;

    public static void main(String[] args) {
        final ReferenceVariableFinal s = new ReferenceVariableFinal();
        // s = new ReferenceVariableFinal();
        System.out.println(s.a+":"+s.b);
        s.a = 33;
        s.b = 44;
        System.out.println(s.a+":"+s.b);
    }
}