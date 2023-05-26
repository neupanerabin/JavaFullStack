package class2;
import java.util.Scanner;

public class Validate {
	public static void main(String[] args) {
		// get user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first name: ");
		String firstName = scanner.nextLine();
		System.out.println("Enter last Name: ");
		String lastName = scanner.nextLine();
		System.out.println("Please Enter address: ");
		String address = scanner.nextLine();
		System.out.println("Please enter city: ");
		String city = scanner.nextLine();
		
		
		// validate user input and display error message
		System.out.println("%nValidate Result: ");
		
		if(!ValidateInput.validateFirstName(firstName))
			System.out.println("Invalid first name");
		else if ()
		
		
	}

}
