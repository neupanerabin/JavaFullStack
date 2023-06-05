package week4.day1;

import java.util.Scanner;
import myLibrary.BasicIo;



public class Calculator {
	

	static double firstNum, secondNum, addition, subtraction, multiplication, division;
	

public static double add1(double num1, double num2) {
	return num1 + num2;
	
}
public static double sub(double num1, double num2) {
	return num1 - num2;
	
}

public static double mul(double num1, double num2) {
	return num1 * num2;
	
}
public static double div(double num1, double num2) {
	return num1 / num2;
	
}

	
	public static void main(String[] args) {
		BasicIo.printMessage("Enter two numbers: ");
// nextDouble() reads the next double from the keyboard
		BasicIo.printMessage("Enter first number: ");
		double first = BasicIo.nextDouble();
		BasicIo.newLine();
		BasicIo.printMessage("Enter second number: ");
		double second = BasicIo.nextDouble();
		BasicIo.newLine();
		BasicIo.printMessage("Enter an operator (+, -, *, /): ");
		char operator = BasicIo.readCharacter();
		double result;
//switch case for each of the operations
		switch (operator) {
		case '+':
			addition = add1(first, second);
			BasicIo.printMessage("addition =", addition);
			break;
		case '-':
			subtraction = sub(first, second);
			BasicIo.printMessage("subtraction", subtraction);
			break;
		case '*':
			multiplication = mul(first, second);
			BasicIo.printMessage("multiplication:", multiplication);
			break;
		case '/':
			division = div(first ,second);
			BasicIo.printMessage("division :" , division);
			break;
// operator doesn't match any case constant (+, -, *, /)

		default:
			BasicIo.printMessage("Error! operator is not correct");
			return;
		}
//printing the result of the operations
		//System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
	}

}