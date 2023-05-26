package class1;

public class Account {
	// question 1 
	/*
	private String name;    // instance variable
	
	// method to set the name of the object
	public void setName(String name) {
		this.name = name;   // store the name;
	}
	
	// method to retrieve the name of the string
	public String getName() {
		return name;    // return the value name of the caller
	}
	*/
	
	// qs 2
	private String name;  // instance variable
	private double balance;   // instance variable
	
	public Account(String name, double balance) {	  // Account constructor that receives two parameter
		this.name = name;		// assign the names to instance variable name;
		
		// validate that the balance is greater than 0.0; if it's not,
		// instance variable balance keeps its default initial value of 0.0
		if(balance > 0.0)    // if the balance is valid
			this.balance = balance;  // assign it to instance variable balance
		
	}
	
	// method that deposits (adds) only a valid amount to the balance
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0)  // if the depositAmount is valid
			balance = balance + depositAmount;  // add it to the balance
	}
	
	// methods returns the account balance
	public double getBalance() {
		return balance;
	}
	// method that set name
	public void setName() {
		this.name = name;
	}
	
	// method that returns the name
	public String getName() {
		return name;   // give a value of name back to caller
	}  // end method getName

}  // end Account Class
