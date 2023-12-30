package Dao;

import java.sql.SQLException;
import java.util.Scanner;
import Dao.User.UserDaoImpl;

public class AdminPage {
	Scanner scanner = new Scanner(System.in);

	private UserDaoImpl userImpl = new UserDaoImpl();

	void adminPage() {

		System.out.println("Enter the option: ");
		System.out.println("1. Add Item");
		System.out.println("2. Change Password");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			additem();

			break;

		case 2:
			changePassword();

			break;

		}
		scanner.nextLine();

	}

	private void additem() {
		System.out.println("Add items change from Here2");

	}

	private void changePassword() {
	    // Implement logic to change the password
	    System.out.println("Enter current username:");
        scanner.nextLine(); // Consume the newline character

	    String currentUsername = scanner.nextLine();

	    System.out.println("Enter new password:");
	    String newPassword = scanner.nextLine();

	    // Print the entered values for debugging
	    System.out.println("Current Username: " + currentUsername);
	    System.out.println("New Password: " + newPassword);

	    // Update the password using UserDaoImpl
	    try {
	        boolean success = userImpl.changePassword(currentUsername, newPassword);

	        if (success) {
	            System.out.println("Password changed successfully.");
	        } else {
	            System.out.println("Failed to change password. User not found.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        System.out.println("Failed to change password. An error occurred.");
	    }
	}

}
