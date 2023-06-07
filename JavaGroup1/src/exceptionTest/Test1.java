package exceptionTest;
import myLibrary.BasicIo;

public class Test1 {

	public static void main(String[] args) {
		// declaration
		int x;
		int y;
		int z;
		
		try {	// try condition start
			// input
			BasicIo.printMessage("enter value for x: ");
			x = BasicIo.readInt();
			BasicIo.newLine();
			BasicIo.printMessage("Read value for y :");
			y = BasicIo.readInt();
			
			// process
			z = x / y;
			
			// output
			BasicIo.printMessage("Result :"+z);
			
		}
		catch(NumberFormatException ex) {	// catch condition use
			BasicIo.printMessage("Error : "+ex);
		}catch(ArithmeticException ae) {
			BasicIo.printMessage("Error "+ae);
		}
		catch(Exception e) {
			BasicIo.printMessage("Error + "+e);
		}
	finally{
		BasicIo.printMessage("error: ");
	}
	}

}

// Reading reference 
// https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html


