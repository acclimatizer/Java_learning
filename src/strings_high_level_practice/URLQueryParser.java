package strings_high_level_practice;

import java.util.*;

class URLQueryParser {

    public static void main(String[] args) {

        String url = "https://shop.com/search?product=laptop&brand=dell&price=1000&sort=low-to-high";

        Map<String, String> queryParams = new HashMap<>();

        int questionMarkIndex = url.indexOf("?");

        if (questionMarkIndex != -1) {

            String queryString = url.substring(questionMarkIndex + 1);

            String[] pairs = queryString.split("&");

            for (String pair : pairs) {

                String[] keyValue = pair.split("=");

                String key = keyValue[0];
                String value = keyValue[1];

                queryParams.put(key, value);
            }
        }

        System.out.println("Extracted Query Parameters:");

        for (String key : queryParams.keySet()) {
            System.out.println(key + " = " + queryParams.get(key));
        }

        String product = queryParams.get("product");
        String brand = queryParams.get("brand");

        System.out.println("\nUser searched for " + brand + " " + product);
    }
}