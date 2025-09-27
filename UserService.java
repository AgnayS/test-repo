package test;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users;
    private EmailService emailService;

    public UserService() {
        this.users = new ArrayList<>();
        this.emailService = new EmailService();
    }

    public User createUser(String name, String email) {
        User user = new User(name, email);
        users.add(user);
        emailService.sendWelcomeEmail(user);
        return user;
    }

    public User findUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public boolean deleteUser(String email) {
        User user = findUserByEmail(email);
        if (user != null) {
            users.remove(user);
            emailService.sendGoodbyeEmail(user);
            return true;
        }
        return false;
    }
}