package loops;

import java.util.Scanner;

public class Nested {

	public static void main(String[] args) {
		// nested loop = Loop inside another loop
		
		Scanner scanner = new Scanner(System.in);	// scanner Class and object create
		// variables initialized
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # rows");		// Display
		rows = scanner.nextInt();				// Variable assigned from user input
		System.out.println("Enter # of columns");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) {		//  loop start 
			System.out.println();
			for(int j=1; j<=columns; j++) {		// loop inside loop 
				System.out.print(symbol);
			}
		}
		
		 
		

	}

}
