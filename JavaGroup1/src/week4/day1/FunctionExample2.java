package week4.day1;

class Numbers{
	int x;
	int y;
	
}
public class FunctionExample2 {
	
	
	public static void swap(Numbers nums) {  // x, y -> Parameters(s) -> formal
		int temp = nums.x;
		nums.x = nums.y;
		nums.x = temp;
		System.out.println("After swap: "+nums.x+ " : "+nums.y);
		
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a= b;
		b= temp;
		System.out.println("After swap: "+a+ " : "+b);
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}

	public static void main(String[] args) {
		// declaration
		// Pass by value example
		int x, y, z;
		// value initialization
		x = 3; 
		y = 4;
		z = 2;
		// display
		System.out.println("Before swap: "+x+ ": "+ y);
		swap(x, y);
		System.out.println(x+ ": "+ y);
		
		// Pass by reference
		System.out.println("Pass by reference");
		Numbers nums = new Numbers();
		nums.x = 9;
		nums.y = 8;
		
		System.out.println(nums.x + " "+ nums.y);
		swap(nums);	// Pass by reference
		System.out.println(nums.x + " :"+ nums.y);
		
		z = sum(9, 2);
		System.out.println(x+ ": "+y+" :"+z);
		
	}

}
