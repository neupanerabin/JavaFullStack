package exceptionTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class CharacterReadWrite {
	public void writeChar(char ch) {
		// write ch in
	}

	public char readChar() {
		return ' ';
	}

	public static void main(String[] args) {
		// write character in file
		// read character in file
		// Accept a string

		try {
			String str = "File Handling in Java using " + " FileWriter and FileReader";

			// attach a file to FileWriter
			FileWriter fw = new FileWriter("/Users/rabin/eclipse-workspace/output.txt");

			// read character wise from string and write
			// into FileWriter
			for (int i = 0; i < str.length(); i++) // loop start to write string 
				fw.write(str.charAt(i));
			System.out.println("Writing successful");
			fw.close();

			// File reader
			FileReader fread = new FileReader("/Users/rabin/eclipse-workspace/output.txt"); // declare object and path
																							// given
			int character;
			while ((character = fread.read()) != -1) {
				System.out.print((char) character);
			}
			int chare = fread.read();
			
			for(int j =0; j<=chare; j++) {
				System.out.println(chare);
			}
			
			fread.close();

		}

		// close the file

		// fw.close();

		catch (Exception e) {
			System.out.println(e);
		}

	}

}
