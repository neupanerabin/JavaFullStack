package arrays;

public class Ond_D_Array {
	public static void main(String[] args) {
		
		// array = used to store multiple values in a single variable
		/*
		String[] cars = {"Tesla", "Toyota", "BMW", "Ferrari"};
		cars[1] = "Yatri";
		System.out.println(cars[1]);
		*/
		
		// Another way to write the array 
		String[] cars = new String[3];
		
		cars[0] = "Camaro";
		cars[1] = "Tesla";
		cars[2] = "Tata"; 
		
//		System.out.println(cars[2]);
		
		for(int i=0; i<=cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
