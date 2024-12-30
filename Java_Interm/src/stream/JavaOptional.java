package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JavaOptional {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("Fullmetal", "Alchemist");
//		System.out.println(getValue(str,"Fullmetal"));

//		if(getValue(str, "Fullmetal")!=null) {
//			System.out.println(getValue(str,"Fullmetal").length());
//
//		}

		System.out.println(getValue(str, "Fullmetal").orElse("Value not found!!!!"));
	}

	public static Optional<String> getValue(List<String> strList, String find) {

		return Optional.ofNullable(find);

	}

}