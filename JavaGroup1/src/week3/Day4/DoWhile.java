package week3.Day4;

import myLibrary.BasicIo;
import myLibrary.Calculator;

public class DoWhile {

	public static void main(String[] args) {
		// declare
		int choice, firstNumber, secondNumber, sum;
		char ch;
		do {
			// input
			BasicIo.printMessage("--------Main Menu--------");
			BasicIo.newLine();
			BasicIo.printMessage("1.Add");
			BasicIo.newLine();
			BasicIo.printMessage("2.Add");
			BasicIo.newLine();
			BasicIo.printMessage("3.Add");
			BasicIo.newLine();
			BasicIo.printMessage("4.Add");
			BasicIo.newLine();
			BasicIo.printMessage("0.Exit");
			BasicIo.newLine();
			BasicIo.printMessage("-------------------");
			BasicIo.newLine();

			BasicIo.printMessage("Enter your choice : ");
			choice = BasicIo.readInt();
			if ((choice >= 0) && (choice <= 1)) {
				// perform calculation
				if (choice == 0) {
					System.exit(0); // exit application
				} else if (choice == 1) {
					// sum
					// read two value from user
					BasicIo.printMessage("Enter first Number : \n");
					firstNumber = BasicIo.readInt();
					BasicIo.printMessage("Enter second Number: ");
					secondNumber = BasicIo.readInt();
					sum = Calculator.sum(firstNumber, secondNumber); // calculate value
					BasicIo.printMessage("Sum : " + sum); // display final result
					BasicIo.newLine();

				}
			} else {
				BasicIo.printMessage("Choice put of range: ");
			}
			BasicIo.printMessage("Do you want to continue (Y?/N) :");
			ch = BasicIo.readCharacter();
		} while ((ch == 'Y') || (ch == 'y'));

	}

}
