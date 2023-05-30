package week3.day1;

public class IfStatement {

	public static void main(String[] args) {
		int numOne = 1;
		if (numOne == 0) // Equals to
			System.out.println("Zero");
		
		if (numOne != 0) // not Equals to
			System.out.println("non zero");
		
		if(!(numOne == 0)) {
			System.out.println("non zero");
		}

	}

}
