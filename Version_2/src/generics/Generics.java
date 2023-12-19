package generics;
import java.util.List;
import java.util.ArrayList;

public class Generics {
	public static void main(String[] args) {
		
		List al = new ArrayList();
		
		al.add("String:");
		al.add(10);
		System.out.println(al);
		
	}
	public static Object getValue(List al) {
		return  al.get(0);
	}

}
