package week2.day4;

public class PassbyValue {

	public static void main(String[] args) {
		// 1. declare two variables of int type
		int a, b;
		// 2. assign two different values
		a = 4; 
		b = 6;
		// 3. create a function which accept two parameters of two integer type 
		System.out.println("Values of a and b :\t"+a+"\t"+b);
		function1(a, b);

	}
	public static void function1(int x, int y) {
		//4. swap values of parameters
		int temp;
		temp =x;
		x= y;
		y = temp;
		System.out.println("After swapinga and b :\t"+x+"\t"+y);
		
	}

}
