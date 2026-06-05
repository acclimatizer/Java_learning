package strings;

class CheckingContentsInURL {
    public static void main(String[] args) {

        String website = "https://google.com";

        System.out.println(website.startsWith("https"));

        System.out.println(website.contains("google"));
    }
}