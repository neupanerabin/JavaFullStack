package arrays_Two_D;

import java.util.ArrayList;

public class Food_List {
	public static void main(String [] args) {
		
		/* ArrayList = a resizable array.
						Elements can be addeed and remove after compilation phase
						store references data types */
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Burger");
		food.add("momo");
		
		
		for(int i = 0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
	}
	

}
