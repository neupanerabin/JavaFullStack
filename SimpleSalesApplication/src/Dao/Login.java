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
					System.out.println("Login successful. \n User type: " + userType);

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

	

	private void openUserPage() {
		System.out.println("Opening user page...");
		UserPage user = new UserPage();
		user.userpage();

	}

	private void openAdminPage() {
		System.out.println("\n *********** Opening admin page...*************");
		AdminPage admin = new AdminPage();
		admin.adminPage();
	}
}
