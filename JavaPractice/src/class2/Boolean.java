package class2;
import java.util.Scanner;

public class Boolean {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character and place a string: ");
		String input = scanner.next();
		char c = input.charAt(0);
		// display the information
		System.out.printf("is defines: %b%n", Character.isDefined(c));
		System.out.printf("is digit: %b%n ", Character.isDigit(c));
		System.out.printf("is first character in java identifier: %b%n", Character.isJavaIdentifierStart(c));
		System.out.printf("is par of a java identifier: %b%n", Character.isJavaIdentifierPart(c));
		System.out.printf("is part of letter :%b%n", Character.isLetter(c));
		System.out.printf("is character or letter :%b%n", Character.isLetterOrDigit(c));
		
	}

}
