package week3.Day2;

public class SwitchCase {

	public static void main(String[] args) {
		int numberOne = 1;
		
		if(numberOne==0) {
			System.out.println("zero");
		}
		else if (numberOne == 1)
			System.out.println("One");
		else if(numberOne == 2)
			System.out.println("Two");
		else if(numberOne == 3)
			System.out.println("Three");
		else if(numberOne == 4)
			System.out.println("Four");
		else if(numberOne == 5)
			System.out.println("Five");
		else if(numberOne == 6)
			System.out.println("Six");
		else if(numberOne == 7)
			System.out.println("Seven");
		
		else 
			System.out.println("Others");
		
		// switch case start
		switch(numberOne) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;	
		default:
			System.out.println("Others");
		}
		
	}

}
