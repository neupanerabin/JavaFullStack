package methods;

public class Methods {
	
	public static void main(String [] args) {
		
		// method = a block of code that is executed whenever it is called upon
		
		String name = "Bro";
		int age = 23;
		hello(name, age);
	}
	static void hello(String names, int ages) {	// can change the argument 
		System.out.println("HELLO " + names +"\t"+ ages);
	}

}
