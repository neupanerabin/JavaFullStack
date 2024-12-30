package treeSet;


/*
 * @author : rabin
 */

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Tree Set used to initialize  the natural ordering
        // initialize the tree set
        TreeSet<String> treeSet = new TreeSet<>();

        // add value to tree set
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("D");

        System.out.println(treeSet);    //Display

    }
}
