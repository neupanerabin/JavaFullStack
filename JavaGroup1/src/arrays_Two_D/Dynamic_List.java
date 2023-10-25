package arrays_Two_D;

import java.util.ArrayList;

public class Dynamic_List {

	public static void main(String[] args) {
		
		// List is created in here for all the available list
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> backeryList = new ArrayList();
		backeryList.add("donuts");
		backeryList.add("bread");
		backeryList.add("garlic bread");
		
//		System.out.println(backeryList);	// to display all
//		System.out.println(backeryList.get(0));	// to display one products
		
		
		ArrayList<String> productList = new ArrayList();
		productList.add("Cucumber");
		productList.add("tomatoes");
		productList.add("peppers");
//		System.out.print(productList);	
		
		groceryList.add(backeryList);
		groceryList.add(productList);
		
		System.out.println(groceryList);	// Display all available list
		System.out.println(groceryList.get(0));	// Display one list 
		System.out.println(groceryList.get(0).get(1)); 	// Display product inside list
		
	}

}
