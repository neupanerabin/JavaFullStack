package map.treeMap;


/*
 * @author : rabin
 */

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        // initialized tree map
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // add values to the tree map
        treeMap.put(3, "A");
        treeMap.put(2, "B");
        treeMap.put(1, "C");

        System.out.println(treeMap);
    }
}
