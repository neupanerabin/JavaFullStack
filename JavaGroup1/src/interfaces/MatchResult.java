package interfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import myLibrary.BasicIo;

public class MatchResult {

	public static void main(String[] args) {

		try {

			/*
			 * // int end() // initialize the StringBuffer object StringBuffer sb = new
			 * StringBuffer("javatutorialone"); BasicIo.printMessage("Contents of buffer:" +
			 * sb); // get the string from buffer from index 8 int end = 8; // initial
			 * integer String str = sb.substring(end);
			 * BasicIo.printMessage("\n Results:"+str);
			 */

			/*
			 * // int start() // initialize the StringBuffer object StringBuffer sb = new
			 * StringBuffer("javatutorialone"); BasicIo.printMessage("Contents of buffer:" +
			 * sb); // get the string from buffer from index 8 int start = 2; // initial
			 * integer String str = sb.substring(start); // initialize new string
			 * BasicIo.printMessage("\n Results:"+str);
			 * 
			 */

		/*	// int groupCount()
			// initialize the StringBuffer object
			StringBuffer sb = new StringBuffer("javatutorialone two");
			BasicIo.printMessage("Contents of buffer:" + sb);
			// get the string from buffer from index 8
			int groupCount = 2; // initial integer
			String str = sb.substring(groupCount); // initialize new string
			BasicIo.printMessage("\n Results:" + str);
			
		*/
			
	/*		// String reverse()
			// initialize the string buffer
			StringBuffer sb = new StringBuffer("reverse of the string ");
			BasicIo.printMessage("Contents of buffer:" + sb);
			// get the string from buffer from index 8
			//int groupCount = 2; // initial integer
			//String str = sb.substring(groupCount); // initialize new string
			sb.reverse();
			BasicIo.printMessage("\n Results:" + sb);
			
		*/
	// String group()
			String input = "java 1 one World";
	        Pattern pattern = Pattern.compile("\\d+");
	        Matcher matcher = pattern.matcher(input);
	        
	        if (matcher.find()) {
	            String matchedSubstring = matcher.group();
	            BasicIo.printMessage("Matched substring: " + matchedSubstring);
	        }

		} catch (Exception ex) {
			BasicIo.printMessage("Error: " + ex);
		}

	}

}

