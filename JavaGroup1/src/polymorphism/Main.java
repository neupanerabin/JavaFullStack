package polymorphism;

public class Main {
	
	public static void main(String [] args) {
		// polymorphism --> identify as the more than one data types
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car, bicycle, boat};	// object is created
		
//		car.go();
		for(Vehicle x: racers) {	// for ech loop is used
			x.go();
		}
		
	}

}
