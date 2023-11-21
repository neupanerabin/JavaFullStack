package Employee_Payroll;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	private double baseSalary;

	public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
		super(first, last, ssn, rate, sales);
		setBaseSalary( salary );	// Validate and store salary
		
	}
	
	// set Base salary
	public void setBaseSalary(double salary) {
		if(salary >= 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary must be >=0.0");
	}
	// return base salary
	public double getBaseSalary() {
		return baseSalary;
	}
	// calculate earnings; override method earnings in CommissionEmployee
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	//	return String representation of BasePlusCommissionEmployee object
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%, .2f",
				"base-salaried", super.toString(),
				"base salary", getBaseSalary());
	}	// end method to String
	
}	// end class BasePlusCommissionE,ployee
