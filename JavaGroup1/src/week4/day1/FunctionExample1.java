package week4.day1;

public class FunctionExample1 {
	
	// addition of two number
	public static int sum(int firstNum, int secondNum) {
		return firstNum + secondNum;
	}
	
	// print label and value
	public static void printMessage(String label, int num1) {
		System.out.println(label +" "+ num1);
	}

	public static void main(String[] args) {
		
		/*
		int numOne, numTwo, numThree;
		numOne = 22; 
		numTwo = 23;
		numThree = numOne + numTwo;
		System.out.println(numThree);
		*/
		
		// declaration
		int numOne, numTwo, add;
		// initialization
		numOne =11;
		numTwo = 22;
		
		add = sum(numOne, numTwo);	// sum of two number
		System.out.println(add);	// display
		
	}

}
