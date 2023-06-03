package week3.Day3;
import myLibrary.BasicIo;

public class NestedIf {

	public static void main(String[] args) {
		
		/*
		// print 1 to 5
		//print 5 to 10
		
		int start, end, mid;
		start = 0;
		mid = 5;
		end = 10;
		
		for(start=0; start<=mid;start++) {
			BasicIo.newLine();
			
			BasicIo.printMessage("Loop 1:"+start);
		}
		for(mid=5; mid<=end; mid++) {
			BasicIo.newLine();
			BasicIo.printMessage("Loop 2 :"+mid);
		}
		*/
		int start1=0, start2=6;
		int stop1=5, stop2=10;
		while(start1<=stop1) {
			BasicIo.printMessage(start1);
			BasicIo.newLine();
			start2 = 6;
			stop2= 10;
			while(start2<=stop2) {
				BasicIo.printMessage(start2);
				BasicIo.newLine();;
				start2++;
			}
			start1++;
		}
		
	}

}
