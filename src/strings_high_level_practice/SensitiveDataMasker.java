package strings_high_level_practice;

class SensitiveDataMasker {

    public static void main(String[] args) {

        String email = "jayadeepreddy@gmail.com";
        String phone = "9876543210";
        String cardNumber = "1234567812345678";
        String ssn = "123-45-6789";

        System.out.println("Masked Email: " + maskEmail(email));
        System.out.println("Masked Phone: " + maskPhone(phone));
        System.out.println("Masked Card: " + maskCard(cardNumber));
        System.out.println("Masked SSN: " + maskSSN(ssn));
    }

    static String maskEmail(String email) {

        int atIndex = email.indexOf("@");

        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex);

        return username.charAt(0) + "****" + username.charAt(username.length() - 1) + domain;
    }

    static String maskPhone(String phone) {

        return "******" + phone.substring(phone.length() - 4);
    }

    static String maskCard(String cardNumber) {

        return "************" + cardNumber.substring(cardNumber.length() - 4);
    }

    static String maskSSN(String ssn) {

        return "***-**-" + ssn.substring(ssn.length() - 4);
    }
}