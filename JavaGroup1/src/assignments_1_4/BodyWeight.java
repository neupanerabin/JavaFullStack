package assignments_1_4;

import myLibrary.BasicIo;

public class BodyWeight {
	public static void main(String[] args) {
		// 110 pounds for the first 5 feet of height
		
		int feet, onefeet, inch,weight;
		onefeet = 110/5;
		
		BasicIo.printMessage("Enter the feet :" );
		feet = BasicIo.readInt();
		BasicIo.printMessage("Enter the inch: " );
		inch = BasicIo.readInt();
		weight = onefeet*feet+ inch*5;
		BasicIo.printMessage("Boday weight :"+weight+" pounds");
		
		
	}

}
