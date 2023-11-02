package Overloaded_Constructor;

public class PizzaMain {
	
	public static void main(String [] srgs) {
		
		Pizza pizza = new Pizza("thick crust", "tomato","mozzerella","h");
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);

	}

}
