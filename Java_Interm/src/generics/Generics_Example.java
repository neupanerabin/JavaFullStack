package generics;


/*
 * @author : rabin
 */

import java.util.ArrayList;
import java.util.List;

public class Generics_Example {

    public static void main (String[] args){
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);

    }
    // ? --> is the wild card accept any type
    private static void printList(List<?> myList){
        System.out.println(myList);

    }
}
class Cat {
    @Override
    public String toString() {
        return "I am a Cat";
    }
}

