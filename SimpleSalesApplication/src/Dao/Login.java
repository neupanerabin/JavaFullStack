package Dao;

import Dao.User.UserDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;
//import Dao.LoginResult;

public class Login {

    private UserDaoImpl userImpl = new UserDaoImpl();
    private Scanner scanner = new Scanner(System.in);
    private String username;
    private String password;
    private String usertype;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public void loginUser() {
        while (true) {
            System.out.println("Enter username:");
            String username = scanner.nextLine();

            System.out.println("Enter password:");
            String password = scanner.nextLine();

            System.out.println("Enter userType:");
            String usertype = scanner.nextLine();

            // Check login credentials using UserDaoImpl
            try {
            	LoginResult loginResult = userImpl.loginCheck(username, password, usertype);

                if (loginResult.getKey()) {
                    // Login successful
                    String userType = loginResult.getValue();
                    System.out.println("Login successful. User type: " + userType);

                    // Navigate to the corresponding page based on user type
                    if ("user".equalsIgnoreCase(userType)) {
                        openUserPage();
                    } else if ("admin".equalsIgnoreCase(userType)) {
                        openAdminPage();
                    } else {
                        System.out.println("Invalid user type.");
                    }

                    break;
                } else {
                    System.out.println("Login failed. Please try again.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    private void changePassword() {
        // Implement logic to change the password
        System.out.println("Enter new password:");
        String newPassword = scanner.nextLine();

        // Update the password using UserDaoImpl
        try {
            userImpl.changePassword(username, newPassword);
            System.out.println("Password changed successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void registerNewUser() {
        // Implement logic to register a new user
        System.out.println("Enter new username:");
        String newUsername = scanner.nextLine();

        System.out.println("Enter new password:");
        String newPassword = scanner.nextLine();

        System.out.println("Enter new userType:");
        String newUserType = scanner.nextLine();

        // Register the new user using UserDaoImpl
        try {
            Users newUser = new Users(0, newUsername, newPassword, newUserType);
            userImpl.insert(newUser);
            System.out.println("User registered successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void openUserPage() {
        System.out.println("Opening user page...");
        AdminPage ad= new AdminPage();
        ad.adminPage();
    }

    private void openAdminPage() {
        System.out.println("Opening admin page...");
        // Add logic to navigate to the admin page
    }
}
