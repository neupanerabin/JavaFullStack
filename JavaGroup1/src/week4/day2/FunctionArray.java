package week4.day2;

class Numbers {	// create class
	int x;
	int y;
	int z;

	public String toString() {	// function defined 
		return (this.x + " : " + this.y + " : " + this.z);
	}
}

public class FunctionArray {

	// value return
	public static int[] function1(int x, int y) { // declare function and assign value to two int
		x++; // increase value by 1
		y++;

		int nums[] = { x, y, x + y };		// assign value to nums
		return (nums);
	}

	// For object return

	public static Numbers function2(int x, int y) {		// function create
		x++;
		y++;
		// Object
		Numbers number = new Numbers();
		number.x = x;
		number.y = y;
		number.z = x + y;
		return number;

	}

	// Pass by reference
	public static void function3(Numbers numbers) {		// reference object is created   
		numbers.x++;
		numbers.y++;
		numbers.z = numbers.x + numbers.y;
	}

	
	public static void main(String[] args) {

		int[] result = function1(4, 5); 	// function call
		for (int num : result) { 			// Accessing value of array
			System.out.println(num); 		// Display the output

			// for function 2
			Numbers number = function2(6, 7);	// new object create and accept return value 
			System.out.print(number);			// Display output

			// function3
			Numbers numbe = new Numbers();		// call function three and create new object for numbers
			numbe.x = 9;	// assign value
			numbe.y = 4;	// assign value 

			function3(numbe); // function call and receive numbers
			System.out.println(numbe);

		}

	}
}
