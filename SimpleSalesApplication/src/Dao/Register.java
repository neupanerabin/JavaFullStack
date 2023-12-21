package Dao;

import Dao.User.UserDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class Register {

    private UserDaoImpl userImpl = new UserDaoImpl();
    private Scanner scanner = new Scanner(System.in);

    public void registerUser() {
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Register");
            System.out.println("2. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter id:");
                    int id = scanner.nextInt();

                    System.out.println("Enter Name:");
                    scanner.nextLine(); // Consume the newline character
                    String username = scanner.nextLine();

                    System.out.println("Enter Address:");
                    String password = scanner.nextLine();

                    System.out.println("Enter Contact Number:");
                    double number = scanner.nextDouble();

                    Users user = new Users(id, username, password, number);

                    try {
                        int rowsAffected = userImpl.insert(user);
                        // Print the number of rows affected by the insertion
                        System.out.println("Rows Affected: " + rowsAffected);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    break;
                case 2:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

   
}
