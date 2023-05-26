import java.util.Scanner;    // import Scanner library files

public class Rough {
	static int roll_no;
	static int mask[] = new int[3];
	static String name;
	static char section, results;
	static float total, average;
	
	public void input() {
		Scanner sc = new Scanner(System.in);  // create objects for scanner
		
		System.out.println("Enter your Roll no: ");
		roll_no = sc.nextInt();  // talking input 
		
		System.out.println("Enter your Name : ");
		name = sc.next();  // talking input from user
		
		System.out.println("Enter your section no: ");
		section = sc.next().charAt(0);  // talking input from user
	
	}
	
	public void masks() {
		int i;
		Scanner sc = new Scanner(System.in);  // create object for scanner
		System.out.println("Enter mask for three subjects:");
		for(i=0 ; i<3; i++) {
			mask[i] = sc.nextInt();
			}
		//System.out.println(mask[i]);

		
	}
	
	public void display() {
		//display output
		int i;
		float mask[]=new float[3];
		float sum=0;
		System.out.println();
		System.out.println("Roll no: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Section: " + section);
        for(i=0 ; i<3; i++) {
        	System.out.println(mask[i]);
        	sum = sum + mask[i];
			}
        
        
		

		
	
        System.out.println("Total mask :"+sum);
        System.out.println("Average :"+average);
        System.out.print("Result: ");
        if(average > 40)  // check condition whether average is greater or not 
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		
		
	}
	
	
	public static void main(String[] args) {
		try {
			// Declarations of the variables 
			Rough r = new Rough();
			//r.input();
			r.masks();
			r.display();
			
			//total = subject1 + subject2 + subject3; 	// add marks of three subjects
			average= total/3;		// calculation of average masks

			// display output
			
			
		}
		catch(Exception ex){
			System.out.println();
			
			
		}

		
	}
	
	
	

}
