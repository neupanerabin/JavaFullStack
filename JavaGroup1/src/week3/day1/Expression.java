package week3.day1;

public class Expression {
	
	// Application of static block?
	static
	{
		System.out.print("hello One\n");
	}
	static
	{
		System.out.print("hello Two \n");
	}

	public static void main(String[] args) {
		// Expression -> valid java Terms (code)
		int numberOne, numberTwo, numberThree;
		numberOne = 12; 
		numberTwo = 33;
		numberThree = numberOne + numberTwo;
		System.out.print(numberThree);

	}  // Block Close
	static
	{
		System.out.print("hello Three \n");
	}


}
