package week3.day1;

import myLibrary.BasicIo;

public class IfStatementNestedIf {

	public static void main(String[] args) {
		// nested if
		int firstNumber, secondNumber, thirdNumber;
		firstNumber = 9;
		secondNumber = 12;
		thirdNumber = 5;

		if (firstNumber > secondNumber)
			if (firstNumber > thirdNumber)
				BasicIo.printMessage(firstNumber + "");

		if (secondNumber > firstNumber)
			if (secondNumber > thirdNumber)
				BasicIo.printMessage(secondNumber + "");

		if (thirdNumber > firstNumber)
			if (thirdNumber > thirdNumber)
				BasicIo.printMessage(thirdNumber + "");

	}

}
