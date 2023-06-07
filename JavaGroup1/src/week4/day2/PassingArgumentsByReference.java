package week4.day2;

import java.awt.Point;
import myLibrary.BasicIo;

public class PassingArgumentsByReference {
	
	private static void change(Point p1) {	// passing by reference 
		p1.x = 1;
		p1.y = 2;
	}

	public static void main(String[] args) {
		Point point = new Point();	// object create and call function
		point.x = 11;
		point.y = 12;
		BasicIo.printMessage("x = "+point.x+" y = "+point.y);	// Display
		BasicIo.newLine();
		
		change(point);	// change value 
		BasicIo.printMessage("x = "+point.x+" y = "+point.y);	// Display 

		
		
	}

}
