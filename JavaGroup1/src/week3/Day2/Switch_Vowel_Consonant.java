package week3.Day2;

import myLibrary.BasicIo;

public class Switch_Vowel_Consonant {

	public static void main(String[] args) {
		// Enter any character : _A | B
		// A is vowel

		// Enter any character : _B
		// b is consonant.
		BasicIo.printMessage("Enter any character: ");
		char inputChar = BasicIo.readCharacter();
		BasicIo.newLine();

		switch (inputChar) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			BasicIo.printMessage(inputChar + " is  vowel letter");
			break;

		default:
			BasicIo.printMessage(inputChar + " is consonant");
		}

	}

}
