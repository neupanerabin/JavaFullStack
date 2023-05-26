package week2.day4;

public class PassByRefrence {

	public static void main(String[] args) {
		 Refrence r1 = new Refrence();
		 r1.x = 9;
		 r1.y = 7;
		 System.out.println(r1);   // toString call 
		 f2(r1);   // Pass by Reference 
		 // f2(r1) // pass by value --> how to pass 
		 System.out.println(r1);
	}
	public static void f2(Refrence rf1) {
		int temp = rf1.x;
		rf1.x = rf1.y;
		rf1.y = temp;
		System.out.println(rf1);
	}
	

}
