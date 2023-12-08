package Collection;

import java.util.ArrayList;
import java.util.List;

public class FirstClassExample {

	public static void main(String[] args) {

		// object instantiation and assigns value
		FirstClass one = new FirstClass(1);
		FirstClass two = new FirstClass(2);
		FirstClass three = new FirstClass(3);

		// List and objects
		List<FirstClass> listOne = new ArrayList<>();
		listOne.add(one);
		listOne.add(two);
		listOne.add(three);
		
		//Enhanced for Each loop
		for (FirstClass a : listOne) {
			System.out.println(a);
		}

	}

}