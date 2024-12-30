package collection;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	
	
	
	public static void main(String[] args) {
		// Creating a container
		List<String> city = new ArrayList<String>();
		
		city.add("New York");
		city.add("Kathmandu");
		city.add("Pokhara:");
		
		// using for each loop 
		for(String a:city) {
			System.out.println(a);
			
		}
	}
	

}
