package test;

public class EmailService {
    private LoggingService logger;

    public EmailService() {
        this.logger = new LoggingService();
    }

    public void sendWelcomeEmail(User user) {
        String message = "Welcome " + user.getName() + "!";
        sendEmail(user.getEmail(), "Welcome!", message);
        logger.logInfo("Welcome email sent to " + user.getEmail());
    }

    public void sendGoodbyeEmail(User user) {
        String message = "Goodbye " + user.getName() + ", we'll miss you!";
        sendEmail(user.getEmail(), "Goodbye!", message);
        logger.logInfo("Goodbye email sent to " + user.getEmail());
    }

    private void sendEmail(String email, String subject, String message) {
        // Simulate sending email
        System.out.println("Sending email to: " + email);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
    }
}