package week2.day3;

public class Operator_Variable {

	public static void main(String[] args) {
		// Primitive data types
		
		boolean result, result2;  // declare 
		result = false;	// assign
		System.out.println(result);  // access
		result = true;    // update
		result2 = result;   // access and assign
		System.out.println(result2);   // access
		
		
		int a, b, c;     // multiple declare
		a=b=c=9;     //multiple assignment 
		             // 9 assign to c; value of c assign to b; value of b assign to a;
		
		//Short-hand assignment
		int d = 9;   // declare d and initialize by 9
		int e;        // declare e;
		d = 89;     // value of 89 is update to d
		System.out.println(d);   // access d
		e = d;  // value of d assign to d;
		System.out.println(e);
		e+=2;  // e = e+2; // +=. -+, *=, %=
		System.out.println(e);
		
		
		// Arithmetic Operator
		//+, -, *, /, exp
		// Math.pow(base, exp)
		// Math.sqrt(value)
		
		int num1 = 5;  // declare num1 and initialize value by 5
		int num2 = 9;  // declare num1 and initialize value by 5
		int sum = num1 + num2;  // addition of two number
		int sub = num1-num2;
		int mul = num1*num2;
		float div = num1/num2;
		System.out.println("sum : "+sum);
		System.out.println("Sub : "+sub);
		System.out.println("Mul : "+mul);
		System.out.println("div :"+div);
		System.out.println("Power: "+Math.pow(num1, num2));
		System.out.println("Sqrt : "+Math.sqrt(num1));
		
		
		//Relational Operators
		// Condition -> boolean 
		// Value RO Value -> Condition -> true/false
			
	// TIPS
			// Naming Conventions and Comments
			// declare
		try {
			// input
			//process
			//output
		}
		catch(Exception ex){
			// error message
		}
		finally {
			// memory clear
		}

		
	}

}
