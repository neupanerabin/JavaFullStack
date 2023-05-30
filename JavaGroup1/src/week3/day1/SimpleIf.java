package week3.day1;

import java.util.Scanner;

public class SimpleIf {
	public static void main(String[] args) {
		int numberOne; // store input from user
		boolean result;
		System.out.print("Enter any number : "); // prompt from user
		numberOne = Integer.parseInt(new Scanner(System.in).nextLine()); // reading integer input from user
		result = (numberOne == 0) ? true : false;
		if (numberOne == 0) { // condition
			System.out.println("Zero");
		}

	}
}
