package Constructor;

public class Main {
	
	public static void main(String[] args) {
		Human humna = new Human("Rabin", 68, 80);	// pass the value
		Human human = new Human("Neupane", 70, 88);	// pass the value
		
		System.out.println(humna.age);		// display the age
		
		humna.eat();		// call eat method
		human.drink();		// call drink method
		
	}

}
