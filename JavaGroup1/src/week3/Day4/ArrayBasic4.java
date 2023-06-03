package week3.Day4;

import myLibrary.BasicIo;

public class ArrayBasic4 {

	public static void main(String[] args) {
		final int MAX = 5;
		int nums[] = new int[MAX];
		int sum[] =new int[MAX];
		int average = 0; // initialize and declaration
		// read elements from user

		for (int number : nums) { // for each next loop
			BasicIo.printMessage("Enter number:"); // diplay
			number = BasicIo.readInt(); // read from user
		
			//average = sum / nums.length; // calculate

		}
		for(int number : nums) {
			sum[nums.length] += number;
		}
		BasicIo.printMessage("sum: " + sum); // display
		BasicIo.newLine();
		BasicIo.printMessage("Average: " + average); // display

		
		// calculate sum of elements
		// calculate average of elements
		

	}

}
