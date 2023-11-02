package oops;

public class Car_Main {
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		Car secondCar = new Car();
		
		myCar.brake();
		System.out.println( myCar.model);
		System.out.println(secondCar.make);
	}

}
