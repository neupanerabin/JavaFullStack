package collection;

import java.util.ArrayList;

public class List {
	
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		
		l1.add(10);
		l1.add(10);
		l1.add(11);
		l1.add("10");
		System.out.println(l1);
		
		l1.remove("10");
		System.out.println(l1);
		
		
//		
//		Iterator itr = l1.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}
