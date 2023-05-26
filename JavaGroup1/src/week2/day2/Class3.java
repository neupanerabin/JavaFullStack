package week2.day2;

public class Class3  implements Inf1{  
	//The type Class3 must implement the inherited abstract method Inf1.f1()
	
	
	
	@Override
	public void f1() {
		System.out.println("Hello from f1 of class 3");
	}
	@Override   // Re-write method -> new version
	public void f2() {
		System.out.println("Hello from f2 of class 3");
	}
	
	@Override
	public void f3() {
		System.out.println("Call to the class 3");
	}
	
	public static void main(String[] args) {
		Class3 obj3 = new Class3();
		obj3.f1();
		obj3.f2();
		obj3.f3();
	}
	
	

}
