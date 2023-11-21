package Employee_Payroll;

public class PayrollSystemTest {
	
	public static void main(String [] args) {
		
		// create subclass objects
		SalariedEmployee salariedEmployee = new SalariedEmployee("Rabin","Neupane", "11-11-11", 800.00);
		
		
		
//		System.out.println("Employees processed individually:  ");
//		System.out.printf("%s: \n %s: \n $%, .2f \n",salariedEmployee.earnings());
		HourlyEmployee hourlyEmployee =
		new HourlyEmployee( "Karen", "Price", "222-22-2222", 16.75, 40 );
		CommissionEmployee commissionEmployee =
		   new CommissionEmployee(
		   "Sue", "Jones", "333-33-3333", 10000, 0.6 );
		BasePlusCommissionEmployee basePlusCommissionEmployee =
		   new BasePlusCommissionEmployee(
		   "Bob", "Lewis", "444-44-4444", 5000, 0.4, 300 );
		
		System.out.println( "Employees processed individually:\n" );
		System.out.printf( "%s\n%s: $%,.2f\n\n",
		   salariedEmployee, "earned", salariedEmployee.earnings() );
		System.out.printf( "%s\n%s: $%,.2f\n\n",
		   hourlyEmployee, "earned", hourlyEmployee.earnings() );
		System.out.printf( "%s\n%s: $%,.2f\n\n",
		   commissionEmployee, "earned", commissionEmployee.earnings() );
		System.out.printf( "%s\n%s: $%,.2f\n\n",
		   basePlusCommissionEmployee,
		   "earned", basePlusCommissionEmployee.earnings() );
		
		// create four-element employee array
		Employee[] employees = new Employee[4];
		
		//initialize array with Employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		System.out.println("Employees processed polymorphically: \n");
		// generically process each element in array employee
		
		for(Employee currentEmployee: employees) {
			System.out.println(currentEmployee);
			
			// determine whether the element in array employees
			
			if(currentEmployee instanceof BasePlusCommissionEmployee) {
				// downcast Employee reference to
				//BasePlusCommissionEmployee reference
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
				
				
			}
		}
		
	}
	
}
