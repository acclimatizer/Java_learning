package strings;

class CleaningUserInput {
    public static void main(String[] args) {

        String email = "   JAY@GMAIL.COM   ";

        email = email.trim().toLowerCase();

        System.out.println(email);
    }
}