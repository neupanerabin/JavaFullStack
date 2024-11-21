package array_List;


/*
 * @author : rabin
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args){

        ArrayList<String> people = new ArrayList<>();

        int[] array = new int[100];
        people.add("5");
        people.add("2");
        people.add("9");
        people.add("4");

        Collections.reverse(people);
        System.out.println(people);
    }
}
