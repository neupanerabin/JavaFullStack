package super_keyword;

public class Main {
public static void main(String [] args) {
	
	Hero heroOne = new Hero("Batman", 42, "$$$");
	Hero heroTwo = new Hero("Superman", 44, "PowerHouse");
	
	System.out.println(heroOne.name);
	System.out.println(heroOne.age);
	System.out.println(heroOne.power);
	
	System.out.println(heroTwo.toString());
	
	
		
	}


}
