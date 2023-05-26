package week2.day3;

public class Class1 {
	static int num3 = 45;

	public static void main(String[] args) {
		//Lifetime
		int num1 = 9;  // Lifetime -> Exist in Memory?
		//visibility  - Scope of variable
		int num2 = 12;
		System.out.println(num3);
	}
	public static void f1() {
		// Visibility of num2 is on main only
		
		//System.out.println(num2);   //num2 cannot be resolved to a variable	}
		System.out.println(num3);   // global variable

	}
}

class Class2{
	int num5;  // local for class 2 only
	void f2() {
		num5 = 8;
	}
	void f3() {
		System.out.println(num5);
	}
}