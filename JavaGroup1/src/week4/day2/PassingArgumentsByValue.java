package week4.day2;


public class PassingArgumentsByValue {

public static void increment(int x, int y) {
	
	x++;
	y++;
	System.out.println("Increment value :" +x+", "+y);
	
}
	public static void main(String[] args) {
		
		increment(5,6);
		System.out.println();
		
	}

}
