package jdbcv4;

public class Person {
	// Instance variables
	int pid;
	String name;
	String address;
	
	public Person() {	// Default constructor
		this.pid=0;
		this.name="";
		this.address= "address";
	}
	
	public Person(int id, String name, String address) {	// Default constructor
		this.pid=pid;
		this.name=name;
		this.address= address;
	}
	// Getter
	
	@Override
	public String toString() {
		return this.pid+", "+ this.name+", "+this.address;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
