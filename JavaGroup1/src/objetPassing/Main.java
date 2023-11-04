package objetPassing;

public class Main {
	public static void main(String [] args) {
		Garage garage = new Garage();
		
		Car car = new Car("BMW");	// value is send to the Car, car object is created
		Car cars = new Car("Audi");
		
		garage.park(car);		// void method is called
		garage.park(cars);
		
	}

}
