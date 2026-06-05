package strings;

class DifferentEquals {
    public static void main(String[] args) {

        String a = new String("Apple");
        String b = new String("Apple");

        System.out.println(a == b);

        System.out.println(a.equals(b));
    }
}