package arrayofObjects;

public class FoodMain {
	public static void main(String [] args) {
		
		int[] numbers = new int[3];
		char[] characters = new char[4];
		String[] strings = new String[5];
		
		
//		Food[] refrigerator = new Food[3];
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("burger");
		
		Food[] refrigerator = {food1,food2};		// can store more data at once
		 
		
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		
		System.out.println(refrigerator[0].name);
		
	}

}
