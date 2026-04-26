package a13_typecasting;

class TypeCastingEx3{
    public static void main(String[] args) {
        Object obj = new String();
        String str = (String) obj;
        System.out.println(str.length());
    }
}