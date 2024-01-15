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
			System.out.println("\n Choose an option:");
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
					orderItem();
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
	
   
	private void orderItem() {
	    System.out.println("Ordering Items");

	    try {
	        // Replace these with actual values or retrieve from user input
	        int orderId = 0;  // Replace with actual order ID
	        String productName = "ExampleProduct";  // Replace with actual product name
	        int quantity = 10;  // Replace with actual quantity
	        int userId = 1;  // Replace with actual user ID

	        int itemId = 1;  // Replace with actual item ID

	        // Assuming you have a UserDaoImpl object named userImpl
	        boolean rowsAffected = userImpl.orderItem(orderId, productName, quantity, userId, itemId);

	        // Print the result of the operation
	        if (rowsAffected) {
	            System.out.println("Order placed successfully!");
	        } else {
	            System.out.println("Failed to place the order.");
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


	private void billing() {
	    System.out.println("This is billing");

	    // View billing records
	    boolean success = userImpl.viewBillingRecords();

	    // Display a message based on the success of viewing billing records
	    if (success) {
	        System.out.println("Billing records displayed successfully.");
	    } else {
	        System.out.println("Failed to retrieve billing records. Please try again later.");
	    }
	}



	private void viewitem() {
		System.out.println("\t \n **********Products***********");
		try {
			int itemid = 0;
			String productName = null;
			Float price = (float) 0;
			boolean rowsAffected = userImpl.viewitems(itemid,productName, price);
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
