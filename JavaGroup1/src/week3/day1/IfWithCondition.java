package week3.day1;
import myLibrary.BasicIo;

public class IfWithCondition {

	public static void main(String[] args) {
		int firstNumber, secondNumber, thirdNumber;
		BasicIo.printMessage("enter Number 1 to 3 : ");
		firstNumber = BasicIo.readInt();
		secondNumber = BasicIo.readInt();
		thirdNumber = BasicIo.readInt();
		
		if(firstNumber > secondNumber && firstNumber >=thirdNumber)
			BasicIo.printMessage("LargestNumber : " + firstNumber);
		
		if(secondNumber > firstNumber && secondNumber >=thirdNumber)
			BasicIo.printMessage("LargestNumber : " + secondNumber);
		
		if(thirdNumber > firstNumber && thirdNumber >=secondNumber)
			BasicIo.printMessage("LargestNumber : " + thirdNumber);
		
	}

}
