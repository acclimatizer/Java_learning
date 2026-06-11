class SupportTicketClassifier {

    public static void main(String[] args) {

        String ticket = """
                My payment failed but money was deducted from my bank account.
                I need refund immediately.
                """;

        String cleanedTicket = ticket.toLowerCase().trim();

        String category = "GENERAL";
        String priority = "LOW";

        if (cleanedTicket.contains("payment") || cleanedTicket.contains("refund") || cleanedTicket.contains("deducted")) {
            category = "BILLING";
        } else if (cleanedTicket.contains("login") || cleanedTicket.contains("password")) {
            category = "ACCOUNT";
        } else if (cleanedTicket.contains("error") || cleanedTicket.contains("crash")) {
            category = "TECHNICAL";
        }

        if (cleanedTicket.contains("immediately") ||
                cleanedTicket.contains("urgent") ||
                cleanedTicket.contains("failed")) {
            priority = "HIGH";
        }

        System.out.println("Ticket Category: " + category);
        System.out.println("Ticket Priority: " + priority);

        String ticketId = "TKT-" + category.substring(0, 3) + "-" + System.currentTimeMillis();

        System.out.println("Generated Ticket ID: " + ticketId);
    }
}