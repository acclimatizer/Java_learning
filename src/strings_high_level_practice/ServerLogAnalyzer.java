package strings_high_level_practice;

import java.util.*;

class ServerLogAnalyzer {

    public static void main(String[] args) {

        String[] logs = {
                "2026-06-11 10:20:15 INFO User login successful userId=101",
                "2026-06-11 10:22:11 ERROR Database connection failed",
                "2026-06-11 10:23:45 WARN API response time high endpoint=/payments",
                "2026-06-11 10:25:20 ERROR NullPointerException in OrderService",
                "2026-06-11 10:30:01 INFO Payment completed userId=101"
        };

        int infoCount = 0;
        int warnCount = 0;
        int errorCount = 0;

        List<String> errorMessages = new ArrayList<>();

        for (String log : logs) {

            if (log.contains("INFO")) {
                infoCount++;
            } else if (log.contains("WARN")) {
                warnCount++;
            } else if (log.contains("ERROR")) {
                errorCount++;

                // Extract only message after ERROR
                int errorIndex = log.indexOf("ERROR");
                String errorMessage = log.substring(errorIndex + 6);
                errorMessages.add(errorMessage);
            }
        }

        System.out.println("INFO Logs: " + infoCount);
        System.out.println("WARN Logs: " + warnCount);
        System.out.println("ERROR Logs: " + errorCount);

        System.out.println("\nError Details:");
        for (String error : errorMessages) {
            System.out.println("- " + error);
        }

        if (errorCount >= 2) {
            System.out.println("\nAlert: System needs immediate attention");
        }
    }
}