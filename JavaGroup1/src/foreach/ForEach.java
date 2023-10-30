package foreach;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		
		// for-each = traversing technique to iterate through the elements in an array/collection
		//			less steps, more readable
		//			less flexible
		
//		String[] animals = {"cat", "dog", "rat", "bird"};   
		
		// use for each by using array list
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("rat");
		animals.add("birds");
		animals.add("dog");
		
		for(String i : animals) {		// iterates one foe each in animals
			System.out.println(i);
			
		} 
		
		

	}

}
