package interfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import myLibrary.BasicIo;

public class JavaMatcher {

	public static void main(String[] args) {
		
	/*	
		// public boolean matcher
		// true if match else false
		System.out.println(Pattern.matches("[banana]", "qda"));
		System.out.println(Pattern.matches("[mango]", "mn"));
		System.out.println(Pattern.matches("[orange]", "e"));
		
	*/	// 2. public boolean find();
		while(true) {
			BasicIo.printMessage("consider a regular expression :");
			Pattern patter = Pattern.compile(BasicIo.readString());
			BasicIo.printMessage("Next text to execute : ");
			Matcher matchinput = patter.matcher(BasicIo.readString());
			boolean found = false;
			while(matchinput.find()) {
				BasicIo.printMessage("Text need to be searched "+ matchinput.group()+" from starting index "+
				matchinput.start()+" and find ending index "+ matchinput.end());
			}
			if(!found) {
				BasicIo.newLine();
				BasicIo.printMessage(" No match is found after compiler");
			}
			
			
		}
		

	}

}
