package week4.day2;

 class functionExample {
	
	public void firstFunction() {	// create first function
		System.out.println("first Function");
	}
	public static void secondFunction() {	// create second function
		System.out.println("second function");	// display
	}
	public final void functionThree() {		// create third function
		System.out.println("Third Function");	// display
	}
	

}
public class NewFunction extends functionExample{	
	@Override
	public void firstFunction() {	// override firstFunction 
		System.out.println("f11");
	}
	
	// cann't override static method
	// cann't override final method
	public static void main(String[] args) {
		NewFunction neew = new NewFunction();	// object create of new function 
		neew.firstFunction();	// call firstFunction
		neew.secondFunction();	// call seconfFunction
	}
}
// non-static method -> object.function()  // can override
// static method -> class.function() // cannot override
// final method -> object.function()  //cannot override


