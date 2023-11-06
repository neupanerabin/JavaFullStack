package encapsulation;

public class Car {
	
	// private variable
	private String make;
	private String model;
	private int year;
	
		Car(String make, String model, int year){	// point the parameters
			this.make = make;
			this.model = model;
			this.year = year;
			
		}
	
	// getter method is used
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	// setter methods
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	

}
