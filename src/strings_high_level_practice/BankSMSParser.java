package strings_high_level_practice;

class BankSMSParser {

    public static void main(String[] args) {

        String sms = "Your A/C XX1234 debited by INR 2450.75 at AMAZON on 10-JUN-2026. Avl Bal INR 15200.90";

        String lowerSms = sms.toLowerCase();

        String transactionType = lowerSms.contains("debited") ? "DEBIT" : "CREDIT";

        // Extract account number
        int accountStart = sms.indexOf("XX");
        String accountNumber = sms.substring(accountStart, accountStart + 6);

        // Extract amount
        int amountStart = sms.indexOf("INR") + 4;
        int amountEnd = sms.indexOf(" at");
        String amount = sms.substring(amountStart, amountEnd);

        // Extract merchant
        int merchantStart = sms.indexOf("at ") + 3;
        int merchantEnd = sms.indexOf(" on");
        String merchant = sms.substring(merchantStart, merchantEnd);

        // Extract date
        int dateStart = sms.indexOf("on ") + 3;
        int dateEnd = sms.indexOf(". Avl");
        String date = sms.substring(dateStart, dateEnd);

        // Extract balance
        int balanceStart = sms.lastIndexOf("INR") + 4;
        String balance = sms.substring(balanceStart);

        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Account: " + accountNumber);
        System.out.println("Amount: " + amount);
        System.out.println("Merchant: " + merchant);
        System.out.println("Date: " + date);
        System.out.println("Available Balance: " + balance);
    }
}