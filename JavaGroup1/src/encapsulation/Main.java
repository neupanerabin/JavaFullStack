package encapsulation;

public class Main {
	
	public static void main(String [] args) {
		
		Car cars = new Car("MG", "MG-Hector", 2022);	// value assigned
		System.out.println(cars.getMake());
		System.out.println(cars.getModel());


		// value assigned through setter methods
		cars.setMake("Tata:");
		cars.setModel("Nexon");
		cars.setYear(2022);
		System.out.println(cars.getMake());
		System.out.println(cars.getModel());


		
	}

}
