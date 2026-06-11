package strings_high_level_practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class OrderIdGenerator {

    public static void main(String[] args) {

        String customerName = "Jayadeep Reddy";
        String city = "New York";
        int orderNumber = 47;

        // Clean and format customer name
        String[] nameParts = customerName.trim().split(" ");
        String initials = "";

        for (String part : nameParts) {
            initials += part.charAt(0);
        }

        // Take first 3 letters of city
        String cityCode = city.substring(0, 3).toUpperCase();

        // Date and time formatting
        LocalDateTime now = LocalDateTime.now();
        String dateCode = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

        // Format order number with leading zeros
        String formattedOrderNumber = String.format("%05d", orderNumber);

        String orderId = cityCode + "-" + initials.toUpperCase() + "-" + dateCode + "-" + formattedOrderNumber;

        System.out.println("Generated Order ID: " + orderId);
    }
}