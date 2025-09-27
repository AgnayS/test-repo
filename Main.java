package test;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Create some users
        User john = userService.createUser("John Doe", "john@example.com");
        User jane = userService.createUser("Jane Smith", "jane@example.com");

        // Set ages
        john.setAge(25);
        jane.setAge(17);

        // Check if users are adults
        checkUserStatus(john);
        checkUserStatus(jane);

        // Delete a user
        userService.deleteUser("john@example.com");

        // Show remaining users
        System.out.println("Remaining users: " + userService.getAllUsers().size());
    }

    private static void checkUserStatus(User user) {
        String status = user.isAdult() ? "adult" : "minor";
        System.out.println(user.getName() + " is an " + status);
    }
}