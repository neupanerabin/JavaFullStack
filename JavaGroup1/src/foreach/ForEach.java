package foreach;

public class ForEach {

	public static void main(String[] args) {
		
		// for-each = traversing technique to iterate through the elements in an array/collection
		//			less steps, more readable
		//			less flexible
		
		String[] animals = {"cat", "dog", "rat", "bird"};
		
		for(String i : animals) {		// iterates one foe each in animals
			System.out.print(i);
			
		}
		
		

	}

}
