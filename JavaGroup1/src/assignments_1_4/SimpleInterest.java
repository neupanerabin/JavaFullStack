package assignments_1_4;

import myLibrary.BasicIo;

public class SimpleInterest {
	public static void main(String[] args) {
		// initialize variables
		float simpleinterest, principal_amt, no_of_years, int_rate;
		// value asssigns
		principal_amt= 1000;
		no_of_years = 5;
		int_rate = 5;
		
		simpleinterest = (principal_amt*no_of_years*int_rate)/100;	// calculate
		BasicIo.printMessage("simple Interest = "+simpleinterest);	// display
	}
}
