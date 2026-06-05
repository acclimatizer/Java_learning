package strings;

class ReversingAString {
    public static void main(String[] args) {

        String word = "HELLO";

        String reversed = new StringBuilder(word)
                .reverse()
                .toString();

        System.out.println(reversed);
    }
}