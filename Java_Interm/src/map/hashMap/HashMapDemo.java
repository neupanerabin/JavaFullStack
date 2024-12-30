package map.hashMap;


/*
 * @author : rabin
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        // Initialized the hash Map
        Map<String, Integer> map = new HashMap<>();

        // add values to the map

        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);

        System.out.println("Size of map is :-" + map.size());
        System.out.println(map);

        // Get the value of  a
        if(map.containsKey("a")){
            Integer a = map.get("a");
            System.out.println("Value for key "+ "a : "+ a);
        }

        // Get all the key representation provided by the value
        for(String key: map.keySet()){
            System.out.println("  Key: "+key + ", value: " + map.get(key));
        }

        //

    }
}
