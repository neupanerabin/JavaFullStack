package week3.Day2;
import myLibrary.BasicIo;
public class SumofNum {

	public static void main(String[] args) {
		// Declaration
		int sum, start, end, average;
		// initialize
		start=0;
		end = 10;
		sum=0;		
		
		for(start=1; start<=end;start++) {  //condition 
			if(start%2==0) {	// condition
				BasicIo.printMessage("\t Even Number :"+start);
				BasicIo.newLine();
			}
			else {
				BasicIo.printMessage(" Odd number :"+start);
			}
			//start++;
			sum+=start;
		}
		BasicIo.newLine();
		BasicIo.printMessage("sum of ten numbers "+sum);  // display 
		BasicIo.newLine();
		BasicIo.printMessage("Average :"+sum/end);	// display
	}

}
