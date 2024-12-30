package functionalInterface;


import java.util.ArrayList;
import java.util.List;

public class JavaPECS {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(11);
		getValue(li);
		Integer i = 10;
		getInt(i);

	}
	// extends use to take data
	public static Number getValue(List<? extends Number> item) {
		return item.get(0);
	}
	
	// super is use to give the data
	public static void setValue(List<? super Number> item) {
		item.set(0,6);
	}
	
	
	public static Number getInt(Number item) {
		return item;
	}

}
