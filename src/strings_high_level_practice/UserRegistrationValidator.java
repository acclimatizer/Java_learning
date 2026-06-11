package strings_high_level_practice;

import java.util.*;

class UserRegistrationValidator {

    public static void main(String[] args) {

        String fullName = "  jayadeep reddy  ";
        String email = "Jay.Reddy@gmail.com ";
        String password = "Jay@12345";
        String phone = "9876543210";

        List<String> errors = new ArrayList<>();

        // Normalize user input
        fullName = fullName.trim().replaceAll("\\s+", " ");
        email = email.trim().toLowerCase();

        // Validate name
        if (fullName.length() < 3) {
            errors.add("Name must be at least 3 characters");
        }

        // Validate email format
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            errors.add("Invalid email format");
        }

        // Validate password strength
        if (password.length() < 8) {
            errors.add("Password must have at least 8 characters");
        }

        if (!password.matches(".*[A-Z].*")) {
            errors.add("Password must contain uppercase letter");
        }

        if (!password.matches(".*[0-9].*")) {
            errors.add("Password must contain number");
        }

        if (!password.matches(".*[@#$%^&*!].*")) {
            errors.add("Password must contain special character");
        }

        // Validate phone number
        if (!phone.matches("[0-9]{10}")) {
            errors.add("Phone number must be exactly 10 digits");
        }

        if (errors.isEmpty()) {
            System.out.println("User registration successful");
            System.out.println("Name: " + fullName);
            System.out.println("Email: " + email);
        } else {
            System.out.println("Registration failed:");
            for (String error : errors) {
                System.out.println("- " + error);
            }
        }
    }
}