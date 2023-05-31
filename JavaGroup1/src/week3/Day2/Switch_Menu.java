package week3.Day2;

import myLibrary.BasicIo;

public class Switch_Menu {

	public static void main(String[] args) {
		// declaration
		int choice;  // user choice
		int numberOne, numberTwo, numberThree; // user input 
		
		// Display
		BasicIo.printMessage("-----Main Menu----");
		BasicIo.newLine();
		BasicIo.printMessage("1.Addition");
		BasicIo.newLine();
		BasicIo.printMessage("2.subtraction");
		BasicIo.newLine();
		BasicIo.printMessage("3.Multiplication");
		BasicIo.newLine();
		BasicIo.printMessage("4.Division");
		BasicIo.newLine();
		BasicIo.printMessage("Enter number between (0 to 4) :");
		choice = BasicIo.readInt();
		BasicIo.printMessage("Enter number One :");
		numberOne = BasicIo.readInt(); // read from user
		BasicIo.printMessage("Enter number Two :");
		numberTwo = BasicIo.readInt(); // read from user
		// check range
		if((choice >1) && (choice <5)) {
			

		switch (choice) {
		case 1:
			numberThree = numberOne + numberTwo;
			BasicIo.printMessage("Sum : " + numberThree);
			break;
		case 2:
			numberThree = numberOne - numberTwo;
			BasicIo.printMessage("Subtraction : " + numberThree);
			break;
		case 3:
			numberThree = numberOne * numberTwo;
			BasicIo.printMessage("Multiplication : " + numberThree);
			break;
		case 4:
			numberThree = numberOne / numberTwo;
			BasicIo.printMessage("Division : " + numberThree);
			break;
		case 5:
			System.exit(0);
		default:
			BasicIo.printMessage("Please enter between 1 to 4");
			

		}
		}
		else {
			BasicIo.printMessage("Enter number between range");
		}

	}


}
