package week3.Day4;

import myLibrary.BasicIo;

public class ArrayBasic4 {

	public static void main(String[] args) {
		final int MAX = 5;
		int nums[] = new int[MAX];
		int sum = 0;
		float average = 0; // initialize and declaration
		int i, specifiedNumber;


		try {
			// read elements from user
			for (i = 0; i < nums.length; i++) { // for each next loop
				BasicIo.printMessage("Enter number:"); // display
				nums[i] = BasicIo.readInt(); // read from user

			}
			
			// calculate for elements
			for (i = 0; i < nums.length; i++) {
				sum += nums[i];

			}

			
			// calculate average of elements
			average = sum / nums.length;

			BasicIo.printMessage("Sum: " + sum);			// Display of sum
			BasicIo.newLine();
			BasicIo.printMessage("Average: " + average);	// display of average
			
			
			// find and specify number and display number in elements
			// find and display max number of elements 
			// find and display min number in elements
			BasicIo.newLine();
			BasicIo.printMessage("Enter number to check specifeidnumber :");	// Display 
			specifiedNumber = BasicIo.readInt();		// read number from user
			
			for(i = 0; i < nums.length; i++) {		// condition 
				if(nums[i] == specifiedNumber) {	// check the valid number
					BasicIo.newLine();
					BasicIo.printMessage("Number found at index: "+i+" :"+nums[i]);	// display

				}
				else {
					BasicIo.newLine();
					BasicIo.printMessage("specified number not found");
				}
			}
			
			// for array max Value
			int maxValue = nums[0];   // assign max value 0
			for(i = 0; i< nums.length; i++) {  // loop used
				if(nums[i] > maxValue) {		// check condition
					maxValue = nums[i];			// assign max value to array
				}
				
			}
			BasicIo.newLine();
			BasicIo.printMessage("Maximum value: "+maxValue);	// Display
			
			// Array for min value 
			int minValue =  nums[0];	// assign min value
			for(i=0; i< nums.length; i++) {		// condition check
				if(nums[i] < minValue) {		// check condition
					minValue = nums[i];			// assign minimum value to array
				}
			}
			BasicIo.newLine();
			BasicIo.printMessage("Minimum value : "+minValue);  // display
			
		}
		catch(Exception ex) {
			BasicIo.printMessage("ex.error"+ex);
			
		}
		

	}

}
