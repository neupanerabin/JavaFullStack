package Dao;

public class LoginResult {
	
	private final boolean loginSuccessful;
	private final String userType;
	
	public LoginResult(boolean loginSuccessful, String userType) {
		this.loginSuccessful = loginSuccessful;
		this.userType = userType;
	}
	
	public boolean isLoginSuccessful() {
		return loginSuccessful;
	}
	
	public String getUserType() {
		return userType;
	}
}
