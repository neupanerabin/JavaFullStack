package Employee_Payroll;

// Hourly Employee class extends Employee
public class HourlyEmployee extends Employee {

	private double wage; // wage per hour
	private double hours; // hours worked for week

	// five argument constructor
	public HourlyEmployee(String first, String last, String ssn, double hourlyWage, double hoursWorked) {

		super(first, last, ssn); // call this from Employee class
		setWage(hourlyWage); // validate hourly wage
		setHours(hoursWorked); // validate weekly wage

	}

	// set wage
	public void setWage(double hourlyWage) {
		if (hourlyWage >= 0.0) {
			wage = hourlyWage;
		} else
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
	} // end method setWage

	// return get wage
	public double getWage() {
		return wage;
	}

	// setHours
	public void setHours(double hoursWorked) {

		if ((hoursWorked >= 0.0) && (hoursWorked <= 168.0))
			hours = hoursWorked;
		else
			throw new IllegalArgumentException("Hours worked must be >=0.0 and <= 168.0");

	} // end methods set hours

	// return hours worked
	public double getHours() {
		return hours;
	}

// Calculate earnings: override abstract method earnings in Employee
	@Override
	public double earnings() {
		if(getHours() <= 40)	// no overtime
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}	// end method earnings
	
	// return String representation of HourlyEmployee
	@Override
	public String toString() {
		return String.format("hourly employee: %s\n %s: $%, .2f; %s: %, .2f",
				super.toString(), "hourly wage", getWage(),
				"hours worked", getHours());
	} 	// end method to String
}	// end class HourlyEmployee
