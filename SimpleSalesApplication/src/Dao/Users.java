package Dao;

public class Users {
	private int id;
	private String username;
	private String password;
	private String  usertype;
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", userType=" + usertype + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getUserType() {
		return usertype;
	}
	public void setUserType(String userType) {
		this.usertype = userType;
	}
	
	public Users(int id, String username, String password, String usertype) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.usertype = usertype;
	}
	
	
	
	

}
