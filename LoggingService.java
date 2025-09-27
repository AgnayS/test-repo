package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggingService {
    private DateTimeFormatter formatter;

    public LoggingService() {
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    public void logInfo(String message) {
        String timestamp = getCurrentTimestamp();
        System.out.println("[INFO " + timestamp + "] " + message);
    }

    public void logError(String message) {
        String timestamp = getCurrentTimestamp();
        System.err.println("[ERROR " + timestamp + "] " + message);
    }

    public void logWarning(String message) {
        String timestamp = getCurrentTimestamp();
        System.out.println("[WARNING " + timestamp + "] " + message);
    }

    private String getCurrentTimestamp() {
        return LocalDateTime.now().format(formatter);
    }
}