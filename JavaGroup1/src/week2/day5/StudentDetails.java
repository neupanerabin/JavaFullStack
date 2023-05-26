package week2.day5;

import java.util.Scanner;

public class StudentDetails {
	final static int PASS_MARKS = 40;
	final static int SUBJECTS = 3;
	
	public static void printMessage(String message) {
			System.out.print(message);
			
	}
	public static void printMessage(String message, double value) {
		System.out.println(message +": "+value);
	}
	
	public static void printMessage(String message, String value) {
		System.out.println(message +": "+value);
	}
	
	public static void newLine() {
		System.out.println();
	}
	
	public static String readString() {
		return (new Scanner(System.in).nextLine());
}
	public static int readInt() {
		return Integer.parseInt(readString());
	}
	
	public static int sum(int firstNumber, int secondNumber) {
		return (firstNumber + secondNumber);
	}
	
	public static float average(int total, int count) {
		return total/count;
	}
	
	
	public static String result(int math, int science, int physic) {
		String result = " ";

		if (math >= PASS_MARKS && science >= PASS_MARKS && physic >= PASS_MARKS) {
			result = "PASS";
			return result;

		} else {
			result = "FAIL";
			return result;

		}
		
	}
	



	public static void main(String[] args) {
		// declare
		int rollno; // student roll no
		String fullName; // Student full name
		int math, science, physic; // obtain marks of math, science, physic;
		int totalMarks; // total of obtained marks
		String result; // result of student
		float average;
		
		// input
		printMessage("-------Enter Student Details------");
		newLine();
		printMessage("Roll no : ");
		rollno = readInt();
		
		printMessage("FULL NAME: ");
		fullName = readString();
		
		printMessage("MATHS:  ");
		math = readInt();
		
		printMessage("SCIENCE:  ");
		science = readInt();
		
		printMessage("PHYSIC:  ");
		physic = readInt();

		// process
		totalMarks = sum(sum(science,math), physic);   // calculate total marks
		average = average(totalMarks, SUBJECTS);			// calculate average marks
		result = result(math, science, physic);

		// OUTPUT
		System.out.println();
		
		printMessage("Total Marks : " + totalMarks);
		newLine();
		printMessage("Average : " + average);
		newLine();
		printMessage("Result :  " + result);

	}

}
