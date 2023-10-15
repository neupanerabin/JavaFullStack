package Variables;
import java.util.Scanner;

public class Basic_Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name:");
		String name = sc.nextLine();
		
		System.out.println("Age: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Favourite food: ");
		String food = sc.nextLine();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(food);
		
	}

}
