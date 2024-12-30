package Queue;

import java.util.ArrayDeque;

public class ArrayDeques {

	public static void main(String[] args) {

		// create an array deque
		ArrayDeque<String> dqu = new ArrayDeque<String>();

		// Use an ArrayDeque like a stack
		dqu.push("A");
		dqu.push("B");
		dqu.push("C");
		dqu.push("D");

		System.out.println(dqu); 
	}

}
