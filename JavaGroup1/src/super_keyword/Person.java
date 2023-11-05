package super_keyword;

public class Person {
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {	// toString class created
		return this.name + "\t "+this.age+ "\t" ;	// return value
	}
	
	
}
