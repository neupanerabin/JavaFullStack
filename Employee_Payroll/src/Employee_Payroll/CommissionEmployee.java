package Employee_Payroll;

// CommissionEmployee extends Employee
public class CommissionEmployee extends Employee {

	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage

	// five-argument constructor
	public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {

		super(first, last, ssn);
		setGrossSales(sales); // method for sales
		setCommissionRate(rate);
	}

	// set commission rate
	public void setCommissionRate(double rate) {
	    if (rate > 0.0 && rate < 1.0) {
	        commissionRate = rate;
	    } else {
	        throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	    }
	}

	// return Commission rate
	public double getCommissionRate() {
		return commissionRate;
	}

	public void setGrossSales(double sales) {
		if (sales >= 0.0)
			grossSales = sales;
		else
			throw new IllegalArgumentException("Gross sales must be > 0.0");

	}

	public double getGrossSales() {
		return grossSales;
	}

	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	} // end method earnings

	@Override
	public String toString() {
		return String.format("%s: %s\n%s: $%, .2f; %s: %.2f", "commission employee", super.toString(), "gross sales",
				getGrossSales(), "commission rate", getCommissionRate());
	} // end method toString

} // end Class CommissionEmployee
