package functionalInterface;

public class Myfunction_Main {

	public static void main(String[] args) {

		// Using a lambda expression to implement the functional interface
		MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Lambda expression implementation");

		// Calling the method defined in the functional interface
		myFunctionalInterface.myMethod();
	}

}
