package strings_high_level_practice;

import java.util.*;

class APILogSecurityScanner {

    public static void main(String[] args) {

        String[] apiLogs = {
                "GET /api/users?id=101 status=200 ip=192.168.1.10",
                "POST /login username=admin password=' OR '1'='1 status=401 ip=10.0.0.9",
                "GET /search?q=<script>alert('x')</script> status=400 ip=10.0.0.5",
                "DELETE /api/orders/55 status=403 ip=192.168.1.15"
        };

        String[] dangerousPatterns = {
                "' OR '1'='1",
                "<script>",
                "DROP TABLE",
                "--",
                "../"
        };

        for (String log : apiLogs) {

            String normalizedLog = log.toLowerCase();

            boolean suspicious = false;
            String reason = "None";

            for (String pattern : dangerousPatterns) {

                if (normalizedLog.contains(pattern.toLowerCase())) {
                    suspicious = true;
                    reason = pattern;
                    break;
                }
            }

            String method = log.split(" ")[0];
            String ip = extractValue(log, "ip=");

            if (suspicious) {
                System.out.println("Suspicious Request Found");
                System.out.println("HTTP Method: " + method);
                System.out.println("IP Address: " + ip);
                System.out.println("Reason: " + reason);
                System.out.println("------------------------");
            }
        }
    }

    static String extractValue(String text, String key) {

        int start = text.indexOf(key);

        if (start == -1) {
            return "UNKNOWN";
        }

        return text.substring(start + key.length()).trim();
    }
}