package class2;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizing_String {
	// execute application
	public static void main(String[] args) {
		// get sentence
		Scanner sc = new Scanner(System.in);    // scan the input 
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		
		// process user sentence
		String[] tokens = sentence.split(" ");    // one space will take one gap
		System.out.printf("Number of  elements: %d%nThe tokens are: %n", tokens.length);  // counts the total length
		for(String token : tokens) {
			System.out.println(token);
		}
	}
	

}
