package Dao;

import Dao.User.UserDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

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
				break;	
		}
		
	}
	
	void showLogin(){
		
	}

}
