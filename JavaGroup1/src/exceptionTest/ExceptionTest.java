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

public class ExceptionTest {
	public static void main(String[] args) {
		// declare
		int age;
		try {
			BasicIo.printMessage("Enter your age : ");	// age between 18 to 30
			age = BasicIo.readInt();
			if(age <18) {
				throw new LowRange("Age in Low range ");
			}
			else if(age >30) {
				throw new HighRange("Age in High range");

			}
			else {
				BasicIo.printMessage("Your age is ; "+ age);
			}
		}
		catch(NumberFormatException nfe) {
			BasicIo.printMessage("Error1: "+nfe);
		}
		catch(LowRange lr) {
			BasicIo.printMessage("Error2: "+ lr);
		}
		catch(HighRange hr) {
			BasicIo.printMessage("Error3 : "+ hr);
		}
		catch(Exception ex) {
			BasicIo.printMessage("Error : "+ ex);
		}


	}

}
