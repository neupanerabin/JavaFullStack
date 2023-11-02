package Overloaded_Constructor;

public class Pizza {
	
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	Pizza(){
		
	}
	
	Pizza(String bread){
		this.bread = bread;
	}
	
	Pizza(String bread, String sauce){
		this.bread = bread;
		this.sauce = sauce;
	}
	
	Pizza(String bread, String sauce, String cheese){
		this.bread = bread;
		this.cheese = cheese;
		this.sauce = sauce;
	}
	
	Pizza(String bread, String sauce, String cheese, String topping){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
		
	}
	
	

}
