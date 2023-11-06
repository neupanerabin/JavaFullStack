package interfaces.Example;

public class Main {
	public static void main(String [] args) {
		
		Rabbit rabbit = new Rabbit();
		
		rabbit.flee();
		
		// 
		Hawk hawk = new Hawk();
		hawk.hunt();
		
		// new fish class add and used the both interface
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();
		
		
	}

}
