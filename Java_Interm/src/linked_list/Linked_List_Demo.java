package linked_list;


/*
 * @author : rabin
 */

import java.util.LinkedList;

public class Linked_List_Demo {
    public static void main(String[] args) {
        // Linked l ist initialized
        LinkedList<String> list = new LinkedList<>();

        // add list to the linked list
        list.add("A");
        list.add("B");
        list.add("1");
        list.add("4");
        list.add("7");
        list.add("D");
        // Display all the list
        System.out.println("All the list: "+list);

        list.add(2,"E");
        System.out.println("After adding at Index 2: "+ list);

        list.remove("1");
        System.out.println("After removing 1"+list);

        list.remove(0);
        System.out.println("List remove at index 0"+ list);

        list.addFirst("A");
        System.out.println("After adding A: "+ list);

    }
}
