package generics;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Generics {
	public static void main(String[] args) {
		
		List al = new ArrayList();
		
		al.add("String: ");
		al.add(10);
		System.out.println(al);
		// Print to reverse the string
		Collections.reverse(al);
		System.out.println(al);

		for(Object all:al){
			System.out.println(all);

		}
		
	}
//	public static Object getValue(List al) {
//		return  al.get(0);
//	}

}
