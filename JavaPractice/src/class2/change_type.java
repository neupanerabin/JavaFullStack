package class2;
import java.util.Scanner;

public class change_type {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a radix :");
		int radix = sc.nextInt();
		
		// get user choice 
		System.out.printf("Choose one \t%n1 -- %s%n2 -- %s%n" , "Convert digit to character",
				"Convert character to digit");
		int choice = sc.nextInt();	
		
		// process request
		switch(choice) {
		case 1:   // convert digit to character
			System.out.println("Enter a digit: ");
			int digit = sc.nextInt();
			System.out.printf("Convert digit to character : %s%n",Character.forDigit(digit, radix));
			break;
			
		case 2:  // convert character to digit
			System.out.println("Enter a character: ");
			char character = sc.next().charAt(0);
			System.out.printf("Convert character to digit : %s%n", Character.digit(character, radix));
			break;
			
		}
				
		// display character info
		//System.out.printf("is defined ::%b%n", Character.isDefined());
		
	}

}
