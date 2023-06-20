package assignments_1_4;

import myLibrary.BasicIo;

public class Bmi_Calculate {
	
	public static void main(String[] args) {
		// BMI --> Body mass Index 
		float weight, height, bmi;	// declaration 
		
		BasicIo.printMessage("Weight of person : ");	// display 
		weight = BasicIo.readFloat();	// read float
		
		BasicIo.printMessage("\n Height of a person : ");	// display
		height = BasicIo.readFloat(); 	// read int
		
		
		bmi = weight/height*2;	// bmi calculation
		
		BasicIo.printMessage("BMI :"+bmi);	// Display
		
	}
	

}
