package Dao;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import Dao.User.UserDaoImpl;

public class UserPage {
	Scanner scanner = new Scanner(System.in);
	private UserDaoImpl userImpl = new UserDaoImpl();

	void userpage() {

		while (true) {
			System.out.println("Choose an option:");
			System.out.println("1. View Item");
			System.out.println("2. Order Item");
			System.out.println("3. Billing");
			System.out.println("4. Change Password");

			try {
				int choice = scanner.nextInt();

				switch (choice) {
				case 1:
					viewitem();
					break;
				case 2:
					orderitem();
					break;
				case 3:
					billing();
					break;
				case 4:
					changePassword();
					break;
				case 5:
					System.out.println("Exiting the program.");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice. Please enter a valid option.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid option (numeric).");
				scanner.nextLine(); // Consume the invalid input to avoid an infinite loop
			}
		}
	}

	private void billing() {
		System.out.println("This is billing");

	}

	private void orderitem() {
		System.out.println("This is order Items");
	}

	private void viewitem() {
		System.out.println("This is view items");
		System.out.println("**********Products***********");
		try {
            String productName = null;
			float price = 0;
			boolean rowsAffected = userImpl.viewitems(productName, price);
            // Print the number of rows affected by the insertion
            System.out.println("Rows Affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	private void changePassword() {
		// Implement logic to change the password
		System.out.println("Enter current username:");
		scanner.nextLine(); // Consume the newline character
		String currentUsername = scanner.nextLine();

		System.out.println("Enter current userid :");
		int iduser = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		System.out.println("Enter new password:");
		String newPassword = scanner.nextLine();

		// Print the entered values for debugging
		System.out.println("Current Username: " + currentUsername);
		System.out.println("New Password: " + newPassword);

		// Update the password using UserDaoImpl
		try {
			boolean success = userImpl.changePassword(currentUsername, newPassword, iduser);

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
