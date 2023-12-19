package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class JavaStreamAPIExample {

	public static void main(String[] args) {
//		List<String> strList= Arrays.asList("Java","Python","C","Dart","JS");
//		Consumer <String> con=new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		};
//		strList.forEach(s->System.out.println(s));

//		strList.stream().filter(x->x.startsWith("J")).forEach(System.out::println);
//		
//		strList.stream().map(x->x.length()).forEach(System.out::println);

// 		List<Integer> innerList1= Arrays.asList(10,20);
// 		List<Integer> innerList2= Arrays.asList(20,40);
// 		List<Integer> innerList3= Arrays.asList(40,60);
// 		List<Integer> innerList4= Arrays.asList(60,80);
// 		List<Integer> innerList5= Arrays.asList(80,100);

		List<List<Integer>> strList2 = Arrays.asList(Arrays.asList(10, 20), Arrays.asList(20, 40),
				Arrays.asList(40, 60), Arrays.asList(60, 80), Arrays.asList(80, 100));
//		strList2.forEach(s->System.out.println(s));
		strList2.stream().flatMap(list -> list.stream()).forEach(s -> System.out.println(s));

	}

}
