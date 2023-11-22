package Employee_Payroll;

public class PayrollSystemTest {

	public static void main(String[] args) {

		// create subclass objects
		SalariedEmployee salariedEmployee = new SalariedEmployee("Rabin", "Neupane", "11-11-11", 800.00);

		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee("John", "Doe", "123-45-6789", 5000, 0.06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis",
				"444-44-4444", 0.04, 5000, 300);

		System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned",
				basePlusCommissionEmployee.earnings());

		// create four-element employee array
		Employee[] employees = new Employee[4];

		// initialize array with Employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;

		System.out.println("Employees processed polymorphically: \n");
		// generically process each element in array employee

		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee);

			// determine whether the element in array employees

			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				// downcast Employee reference to
				// BasePlusCommissionEmployee reference
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

				employee.setBaseSalary(1.10 * employee.getBaseSalary());

//				System.out.printf("new base salary with 10% increase is: $%,.2f%n", employee.getBaseSalary());
				System.out.printf("new base salary with 10%% increase is: $%,.2f%n%n", employee.getBaseSalary());

			} // end if
			System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
		} // end for

		// get type name of each object in employees array
		for (int j = 0; j < employees.length; j++)
			System.out.printf("Employee %d is a %s \n", j, employees[j].getClass().getName());

	} // end main

} // end class PayrollSystemTest
