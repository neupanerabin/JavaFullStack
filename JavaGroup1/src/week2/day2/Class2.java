package week2.day2;

public class Class2 {
	// Primitive data types
	// boolean, char, int, short, byte , long, float, double
	// Non-primitive data types;
	// String object, Class & Object, Interface, Array
	// enum 
	
	
	
	public enum weekday{sun,mon, tue, wed, thu, fri, sat}
	
	public static void main(String[] args) {
		String str1 = new String("Hello how are you ?");
		Object obj = str1;   // any type of value
		
		Class1 obj1= new Class1();
		obj1.num1 = 87;
		System.out.println(obj1.num1);
		
		
		// Array
		boolean []results;  // declare
		char chars[];  // declare
		results = new boolean[5];
		chars = new char[5];
		
		results[2] = true;
		results[0] = false;
		results[3] = true;
		results[1] = false;
		//results[-1] = true;    //Index -1 out of bounds for length 5
		//results[5] = true;
		results[4] = true;
		System.out.println(results[4]);
		
		weekday wdays = weekday .sun;
		System.out.println(wdays);
		
		
	}

}
