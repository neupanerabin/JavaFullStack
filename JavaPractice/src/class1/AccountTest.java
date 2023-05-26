package class1;

// Creating and manipulating an account object
import java.util.Scanner;
public class AccountTest {
	
	
	// qs 1
/*
	public static void main(String args[]) {
		
		// create a scanner object to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		// create an Account object to assign it tt myAccount
		Account myAccount = new Account();
		
		// display initial value of name (null)
		System.out.printf("Initial name is : %s%n%n", myAccount.getName());
		
		// prompt for read name
		System.out.print("Please enter the name :");
		String theNamme = input.nextLine();  // take input on here
		myAccount.setName(theNamme);         // set the name on here
		System.out.println();   //display the blank line on here
		
		// display the name stored in object myAccount
		System.out.printf("Name in object myAccount is : %n%s", myAccount.getName());
		
	}
*/
	public static void main(String args[]) {
		Account account1 = new Account("Rabin Neupane" ,  500.00);
		Account account2 = new Account("Harry har", 4.56);
		
		// display initial balance of each object
		System.out.printf("%s, balance Rs %.2f%n",account1.getName(), account1.getBalance());
		System.out.printf("%s, balance Rs %.2f%n",account2.getName(), account2.getBalance());
		
		// Create a scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		// for account1
		System.out.print("Enter the deposit amount of account 1:");
		double depositAmount = input.nextDouble();    // obtain user input 
		System.out.printf("%nadding %.2f to account1 balance%n%n",depositAmount);
		account1.deposit(depositAmount);
		
		
		// display balances
		System.out.printf("%s balance : Rs%.2f%n", account1.getName(), account1.getBalance());  // display name and address
		System.out.printf("%s balance : RS%.2f%n", account2.getName(), account2.getBalance());  // display name and balance
		
		// for account 2
		System.out.printf("\nEnter the deposit amount for account 2:");
		depositAmount = input.nextDouble();   // obtain user input
		System.out.printf("%nadding %.2f to account2 balance%n%n",depositAmount);
		account2.deposit(depositAmount);
		
		// display balance 2
		System.out.printf("%s balance : Rs%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance : Rs%.2f%n", account2.getName(), account2.getBalance());
		
		
		
		
	}
}
