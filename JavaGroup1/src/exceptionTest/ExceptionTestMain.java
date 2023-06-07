package exceptionTest;
import myLibrary.BasicIo;

class LowRange extends Exception { // sub class of Exception class
	public LowRange(String message) {
		super(message);
	}

}

class HighRange extends Exception { // sub class of exception class
	public HighRange(String message) {
		super(message);
	}

}

public class ExceptionTestMain {
	public static void main(String[] args) {
		// declare
		int age;
		BasicIo.printMessage("Enter your age : ");	// age between 18 to 30
		age = BasicIo.readInt();
		if(age <18) {
			BasicIo.printMessage("age status :", "Low range");

		}
		else if(age >30) {
			BasicIo.newLine();
			BasicIo.printMessage("age status :", "High range");

		}
		else {
			BasicIo.printMessage("Your age is ; "+ age);
		}
		

	}

}
