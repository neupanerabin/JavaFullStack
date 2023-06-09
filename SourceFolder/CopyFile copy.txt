package Assignments;

import java.util.Scanner;    // import Scanner library files

public class Assignment_1 {
	public static void main(String[] args) {
		try {
			// Declarations of the variables 
			String name;			
			int roll_no;
			char section, results;
			int subject1, subject2, subject3;
			float total, average;
			
			Scanner sc = new Scanner(System.in);  // create objects for scanner
			
			System.out.println("Enter your Roll no: ");
			roll_no = sc.nextInt();  // talking input 
			
			System.out.println("Enter your Name : ");
			name = sc.next();  // talking input from user
			
			System.out.println("Enter your section no: ");
			section = sc.next().charAt(0);  // talking input from user
			
			System.out.println("Enter your subject1  marks: ");
			subject1 = sc.nextInt(); // talking input from user
			
			System.out.println("Enter your subject2 marks: ");
			subject2 = sc.nextInt();  // talking input from user
			
			System.out.println("Enter your subject3 marks: ");
			subject3 = sc.nextInt();  // talking input from user
			
			total = subject1 + subject2 + subject3; 	// add marks of three subjects
			average= total/3;		// calculation of average masks

			// display output
			System.out.println();
			System.out.println("Roll no: " + roll_no);
	        System.out.println("Name: " + name);
	        System.out.println("Section: " + section);
	        System.out.println("Total mask :"+total);
	        System.out.println("Average :"+average);
	        System.out.print("Result: ");
			
			if(average > 40)  // check condition whether average is greater or not 
				System.out.println("PASS");
			else
				System.out.println("FAIL");
			
		}
		catch(Exception ex){
			System.out.println();
			
			
		}

		
	}
	
	
	

}
