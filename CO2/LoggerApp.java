class User {
    private String password; 
    protected String role;   
    public String username;  
    public final static String SYSTEM_NAME = "AccessLogger"; 


    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }


    public void showUserDetails() {
        System.out.println("System Name: " + SYSTEM_NAME);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password); // Can be accessed within the class
        System.out.println("Role: " + role);
    }
}
public class LoggerApp {
    public static void main(String[] args) {
        // Creating User object
        User user1 = new User("jissa123", "securePass", "admin");

        // Accessing fields
        System.out.println("Accessing from LoggerApp:");

        // Directly accessing public field
        System.out.println("Username: " + user1.username);

        // Accessing final static constant
        System.out.println("System Name: " + User.SYSTEM_NAME);

        // Trying to access private field (will cause compile-time error if uncommented)
        // System.out.println("Password: " + user1.password);

        System.out.println("Role (protected): " + user1.role); 

        System.out.println("\nCalling showUserDetails():");
        user1.showUserDetails();
    }
}