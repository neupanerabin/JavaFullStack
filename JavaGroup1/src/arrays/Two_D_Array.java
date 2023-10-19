package arrays;

public class Two_D_Array {

	public static void main(String[] args) {
		
		//  2D array = an array of arrays
		
		// initialized and assign vale in 2D array
		String[][] cars = {
				{"Tata", "Mahindra", "Maruti Suzuki"},
				{"BMW", "Benz", "Volkswogyna"},
				{"BYD", "MG-Hector", "Tesla"}
		};
		
		// nested loop used and display
		for(int i =0; i<=cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
		
	}

}
