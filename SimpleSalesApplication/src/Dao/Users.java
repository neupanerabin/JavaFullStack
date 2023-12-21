package Dao;

public class Users {
	private int id;
	@Override
	public String toString() {
		return "Users [id=" + id + ", Name=" + Name + ", Address=" + Address + ", ContactNumber=" + ContactNumber + "]";
	}
	public Users(int id, String name, String address, double contactNumber) {
		super();
		this.id = id;
		Name = name;
		Address = address;
		ContactNumber = contactNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(double contactNumber) {
		ContactNumber = contactNumber;
	}
	private String Name;
	private String Address;
	private double ContactNumber;
	

}
