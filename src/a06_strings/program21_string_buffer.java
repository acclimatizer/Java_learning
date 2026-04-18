package a06_strings;

class StrBuffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("java");

        System.out.println(sb.append("program").insert(0, "core").delete(4, 8).append("test").replace(4, 8, "frog").substring(7).concat("example").substring(4).replace('e', 'n').toUpperCase().charAt(8));
    }
}