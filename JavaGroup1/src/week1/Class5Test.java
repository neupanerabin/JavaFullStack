package week1;

public class Class5Test {
	public static void main(String[] args) {
		Class5 obj51, obj52;
		obj51 = new Class5();    // call default constructor -> set default 
		
		System.out.println(obj51.num1);   // -1
		
		obj52 = new Class5();
		System.out.println(obj52.num1);   //-1
		
		System.out.println(obj51);    // call toString
		System.out.println(obj51.hashCode());
	
		
	}

}
