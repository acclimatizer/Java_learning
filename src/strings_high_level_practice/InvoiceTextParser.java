package strings_high_level_practice;

import java.util.*;

class InvoiceTextParser {

    public static void main(String[] args) {

        String invoice = """
                Invoice No: INV-2026-0098
                Customer: Jay Reddy
                Email: jay@example.com
                Items:
                Laptop Stand - 39.99
                USB-C Cable - 12.50
                Keyboard - 79.99
                Tax: 9.25
                Total: 141.73
                """;

        Map<String, String> invoiceData = new LinkedHashMap<>();
        List<String> items = new ArrayList<>();

        String[] lines = invoice.strip().split("\\n");

        boolean insideItems = false;

        for (String line : lines) {

            line = line.trim();

            if (line.equalsIgnoreCase("Items:")) {
                insideItems = true;
                continue;
            }

            if (line.startsWith("Tax:") || line.startsWith("Total:")) {
                insideItems = false;
            }

            if (insideItems) {
                items.add(line);
            } else if (line.contains(":")) {

                String[] parts = line.split(":", 2);

                String key = parts[0].trim();
                String value = parts[1].trim();

                invoiceData.put(key, value);
            }
        }

        System.out.println("Invoice Summary");
        System.out.println("----------------");
        System.out.println("Invoice Number: " + invoiceData.get("Invoice No"));
        System.out.println("Customer: " + invoiceData.get("Customer"));
        System.out.println("Email: " + invoiceData.get("Email"));

        System.out.println("\nItems:");
        for (String item : items) {
            System.out.println("- " + item);
        }

        System.out.println("\nTax: $" + invoiceData.get("Tax"));
        System.out.println("Total: $" + invoiceData.get("Total"));
    }
}