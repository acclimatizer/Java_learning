import java.util.*;

class PaymentMessageRouter {

    public static void main(String[] args) {

        String customerMessage = """
                My card was charged twice yesterday.
                Order says payment failed but money got deducted.
                Please refund urgently.
                """;

        String text = customerMessage.toLowerCase();

        Map<String, List<String>> categoryKeywords = new HashMap<>();

        categoryKeywords.put("BILLING", Arrays.asList("charged", "deducted", "refund", "payment"));
        categoryKeywords.put("TECHNICAL", Arrays.asList("error", "crash", "bug", "failed"));
        categoryKeywords.put("ACCOUNT", Arrays.asList("login", "password", "otp", "locked"));

        String selectedCategory = "GENERAL";
        int highestScore = 0;

        for (String category : categoryKeywords.keySet()) {

            int score = 0;

            for (String keyword : categoryKeywords.get(category)) {
                if (text.contains(keyword)) {
                    score++;
                }
            }

            if (score > highestScore) {
                highestScore = score;
                selectedCategory = category;
            }
        }

        String priority = "LOW";

        if (text.contains("urgent") || text.contains("twice") || text.contains("deducted")) {
            priority = "HIGH";
        }

        String caseId = "CASE-" +
                selectedCategory.substring(0, 3) +
                "-" +
                System.currentTimeMillis();

        System.out.println("Case ID: " + caseId);
        System.out.println("Category: " + selectedCategory);
        System.out.println("Priority: " + priority);
        System.out.println("Keyword Score: " + highestScore);
    }
}