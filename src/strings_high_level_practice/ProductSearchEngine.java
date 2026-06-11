import java.util.*;

class ProductSearchEngine {

    public static void main(String[] args) {

        String[] products = {
                "Apple iPhone 15 Pro Max 256GB",
                "Samsung Galaxy S24 Ultra 512GB",
                "Dell Inspiron 15 Laptop Intel i7",
                "Apple MacBook Pro M3 14 inch",
                "Sony Wireless Noise Cancelling Headphones",
                "Logitech Mechanical Keyboard"
        };

        String searchInput = "apple pro";

        // Normalize search input
        searchInput = searchInput.toLowerCase().trim();

        String[] searchWords = searchInput.split("\\s+");

        List<String> results = new ArrayList<>();

        for (String product : products) {

            String normalizedProduct = product.toLowerCase();

            boolean allWordsFound = true;

            for (String word : searchWords) {

                if (!normalizedProduct.contains(word)) {
                    allWordsFound = false;
                    break;
                }
            }

            if (allWordsFound) {
                results.add(product);
            }
        }

        System.out.println("Search Results:");

        if (results.isEmpty()) {
            System.out.println("No products found");
        } else {
            for (String result : results) {
                System.out.println("- " + result);
            }
        }
    }
}