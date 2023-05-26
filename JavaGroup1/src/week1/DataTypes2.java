package week1;

public class DataTypes2 {
	public static void main(String[] args) {
		// Basic Types -> boolean, char, byte, short, int, long, double, float
		//Extended types > String, Object
		
		// User defined data types -> Class
		// Create new class
		
		//Use?
		Class1 obj1;  // object declare
		obj1 = new Class1();
		
		//obj1 -> store, retrieve
		// obj1 -> result -> store/ retrieve
		
		obj1.result = false;
		obj1.ch = 'A';
		System.out.println(obj1.result);
		System.out.println(obj1.ch);
		
		obj1.result = true;
		System.out.println(obj1.result);
		System.out.println(obj1.ch);
		
		
		//Reference -> Pointer
		Class2 obj21, obj22, obj23;
		obj21 = new Class2();
		obj22 = new Class2();
		obj23 = new Class2();
		
//		store value on obj21
//		retrieve value on obj22
		obj22 = obj21;
		obj21.num1=66;
		System.out.println(obj22.num1);
		
		obj22.num1 = 345;
		System.out.println(obj22.num1);
		
		System.out.println(obj21.hashCode());
		System.out.println(obj22.hashCode());
		System.out.println(obj22.hashCode());
		
		// Class3
		
		Class3 obj31, obj32;
		obj31 = new Class3();
		obj31.num1 = 90;        // non static
		obj31.num2 = 89;   		// static
		System.out.println(obj31.num1+", "+obj31.num2);
		
		obj32 = new Class3();
		System.out.println(obj32.num1 +" ,"+obj32.num2);
		
		Class3.num2=100;
		System.out.println(obj31.num1+" ,"+obj31.num2);
		System.out.println(obj32.num1+" ,"+obj32.num2);
		
		System.out.println(Class3.num2);
		
		
		// Class4 
		Class4 obj41;
		Class4 obj42;
		obj41 = new Class4();
		obj41.f1();
		obj41.f2();
		
		//Class4.f1();  //Cannot make a static reference to the non-static method f1() from the type Class4
		Class4.f2();
		
		//obj42.f2();  //The local variable obj42 may not have been initialized
		
		
		
		
	}
	

}
