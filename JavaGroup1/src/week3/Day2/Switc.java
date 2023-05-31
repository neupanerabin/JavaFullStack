package week3.Day2;
import myLibrary.BasicIo;

public class Switc {

	public static void main(String[] args) {
		// Difference between if and switch case statement?
		BasicIo.printMessage("Enter any number (1 -7) :");
		int day = BasicIo.readInt();
		if((day <1) && (day <7)) {
			System.out.println("Out of range ");
		}
		
		if (day == 1) {
			BasicIo.printMessage("sunday");
		}
		else if (day == 2) {
			BasicIo.printMessage("Monday");
		}
		else if (day == 3) {
			BasicIo.printMessage("Tuesday");
		}
		else if (day == 4) {
			BasicIo.printMessage("Wednesay");
		}
		else if (day == 5) {
			BasicIo.printMessage("Thursday");
		}
		else if (day == 6) {
			BasicIo.printMessage("Friday");
		}
		else if (day == 7) {
			BasicIo.printMessage("Saturday");
		}
		
		
	}

}
