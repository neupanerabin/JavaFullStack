package week3.Day4;

public class ArrayBasic3 {

	public static void main(String[] args) {
		// declare and initialize
		int nums[] = {6,5,8, 3,9};
		// increase elements b y 1
		for(int i = 0; i<nums.length;i++) {
			nums[i] +=1;
		}
		// print elements
		// processing and accessing 
		for(int number:nums) {  // for each next loop
			System.out.println(number);
		}
	}

}
