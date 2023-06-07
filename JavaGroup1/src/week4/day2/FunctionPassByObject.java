package week4.day2;

public class FunctionPassByObject {
	
	// pass by value
	public static void function1(int num1) {
		System.out.println(num1);
		function1(num1++);
	}
	
	
	// print from 1 to 10
	public static void function2(int num1) {
		
		if (num1 <= 10) {
            System.out.println(num1);
            function2(num1+1);
        }
    }
		
	public static void main(String[] args) {
		// call function 1 and 2
		function2(1);
		function1(3);
	}

}
