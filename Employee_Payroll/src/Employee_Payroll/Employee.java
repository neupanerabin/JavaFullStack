package Employee_Payroll;

public abstract class Employee {

	// Employee abstract super class
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	// three argument constructor
	public Employee(String firstname, String lastname, String socailnumber) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.socialSecurityNumber = socailnumber;
	} // end three-argument constructor

	// set first name
	public void setFirstName(String first) {
		firstName = first;
	}

	// set last name
	public void setLastName(String last) {
		lastName = last;
	}

	// set social sn
	public void setSocialSecurityNumber(String scn) {
		socialSecurityNumber = scn;
	}

	// return first name
	public String getFirstName() {
		return firstName;
	}

	// return last name
	public String getlastName() {
		return lastName;
	}

	// return social security number
	public String getsocialSecurityNumber() {
		return socialSecurityNumber;
	}

	//return String representation of Employee object
	@Override
	public String toString() {
		return String.format("%s %s \nsocial security number: %s", getFirstName(), getlastName(),
				getsocialSecurityNumber());
	}

	// abstract method overridden by concrete subclass
	public abstract double earnings();

}
