package reverse;


/*
 * @author : rabin
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_String {
    public static void main(String[] args){

        // Initialization to array
        List<String> people = new ArrayList<>();

        // Add string to list
        people.add("5");
        people.add("2");
        people.add("9");
        people.add("hi");
//        people.remove(1);

        // reverse the string
        Collections.reverse(people);
        System.out.println(people);  // Display
    }
}
