import java.util.*;

class SmartSearchNormalizer {

    public static void main(String[] args) {

        String[] products = {
                "Apple MacBook Pro 14 inch M3 Chip",
                "Macbook Air 13 inch M2",
                "Dell XPS 15 Laptop",
                "Apple iPhone 15 Pro Max",
                "Samsung Galaxy Book Pro"
        };

        String userSearch = " apple   pro laptop ";

        List<String> results = new ArrayList<>();

        String normalizedSearch = normalize(userSearch);
        String[] searchWords = normalizedSearch.split(" ");

        for (String product : products) {

            String normalizedProduct = normalize(product);

            int score = 0;

            for (String word : searchWords) {

                if (normalizedProduct.contains(word)) {
                    score++;
                }
            }

            if (score > 0) {
                results.add(product + " | Match Score: " + score);
            }
        }

        System.out.println("Search Results:");
        for (String result : results) {
            System.out.println(result);
        }
    }

    static String normalize(String text) {

        return text.toLowerCase()
                .replaceAll("[^a-z0-9\\s]", " ")
                .replaceAll("\\s+", " ")
                .trim();
    }
}