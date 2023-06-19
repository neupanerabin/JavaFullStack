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
		
	*/	
	/*	// 2. public boolean find(); 
        String input = "Hello 123 World";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        
        
        if (matcher.find()) {
            System.out.println("Match found!");
        } else {
            System.out.println("No match found!");
        }
    */    
	/*
       // 3. public boolean find(int start)
		
		String REGEX = "java";	// regex declared
		String INPUT = "java hello java";	// input declared
		Pattern pattern = Pattern.compile(REGEX);	// compile the regex
		
		// get a matcher object
		Matcher matcher = pattern.matcher(INPUT);	// match the pattern
		
		if(matcher.find(1)) {	// check the finder 
			BasicIo.printMessage("Matcher found at index : "+ matcher.start());	// match start 
		}else {
			BasicIo.printMessage("No match found ");
		}
	*/	
/*
		// public String group()
		String text = "hello java welcome to the metahorizon. This is java class";	// input string 
		String pattern_check = "class";	// text need to check
		Pattern pattern = Pattern.compile(pattern_check);	// compile pattern check
		Matcher matcher = pattern.matcher(text);	// match text with pattern check
		
		while(matcher.find()) {
			BasicIo.printMessage("\nMatched text: " +matcher.group());
		}
		
	*/
		// 5. public int start() and int start(int group)
		
		String text = "This is new class of java" + "java class with new environment";
		String check_context = "java";
		Pattern pattern = Pattern.compile(check_context);
		Matcher matcher = pattern.matcher(text);
		int count = 0;
		while(matcher.find()) {
			count ++;
			BasicIo.newLine();
			BasicIo.printMessage("Matching Context : " + count +": "+matcher.start());
			
		}

	}

}
