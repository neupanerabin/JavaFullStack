package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional_main {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("hello", "Wrold");
//		System.out.println(findValue(str, "java").length()); // Corrected here
		
		Optional<String> result = Optional.ofNullable(findValue(str, "java"));

        if (result.isPresent()) {
            System.out.println(result.get().length());
        } else {
            System.out.println("Value not found");
        }
	}

	public static String findValue(List<String> strList, String find) {
		if (strList.contains(find)) {
			return find;
		} else {
			return null;
		}
	}

}
