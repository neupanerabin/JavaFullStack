package week3.day1;

import myLibrary.BasicIo; // import from another package

public class IfElse {
	public static void main(String[] args) {
		BasicIo.printMessage("enter any number : ");
		int firstNumbers;
		firstNumbers = BasicIo.readInt();
		if (firstNumbers == 1) {
			System.out.println("Zero");
		} else if (firstNumbers == 0) {
			System.out.println("One");
		} else if (firstNumbers == 1) {
			System.out.println("Nine");
		}

	}

}
