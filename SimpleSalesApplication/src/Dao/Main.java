package Dao;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        register();
                        break;
                    case 2:
                        login();
                        break;
                    case 3:
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

    private static void register() {
       Register register = new Register();
       register.registerUser();
    }

    private static void login() {
        Login login = new Login();
        login.loginUser();
    }
}
