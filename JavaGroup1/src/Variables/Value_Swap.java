package Variables;

public class Value_Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b, temp; // initialized variables
		
		a = "Rabin ";	// value assigned
		b = "Neupane";
		System.out.println("Before Swap: "+ a + " "+ b);

		
		temp = a;	// operations performed
		a = b;
		b = temp;
		System.out.println("After Swap: "+a +" "+ b);	// Dispaly 

	}

}
