package week3.Day4;
import myLibrary.BasicIo;

public class ArrayBasic2 {

	public static void main(String[] args) {
		final int MAX = 5;
		int nums[] = new int[MAX];
		//input
		
		for(int i = 0; i<MAX; i++) {
			BasicIo.printMessage("Enter number :"+(i+i)+":");
			BasicIo.readInt();			
		}
		// Processing
		// add, sub
		for(int i = 0; i<nums.length;i++) {
			nums[i] +=1;
		}
		// output
		for(int i =0; i<nums.length;i++) {
			BasicIo.printMessage("Value" +(i+i)+ " : "+nums[i]);

		}
	}

}
