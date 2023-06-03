package week3.Day4;

public class ArrayBasic {

	public static void main(String[] args) {
		// similar types of multiple values
		int nums[];	 //declare
		nums = new int[5];	// initialization
		
		// value assign 
		nums[0] = 1;
		nums[1] = 2;
		nums[3] = 4;
		nums[4] = 5;
		nums[2] = 9;
		
		// value access
		System.out.println(nums[0] +" ,"+nums[1] +" ,"+nums[2] +" ,"+nums[3] +" ,"+nums[4]);
		System.out.println(nums.length);  // length of an array
		
	}

}
