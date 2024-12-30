package hashSet;


/*
 * @author : rabin
 */

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        boolean ra = hashSet.add("D");
        boolean b2 = hashSet.add("D");
        System.out.println(hashSet);

        System.out.println(ra);
        System.out.println(b2);

        // hash set Contains set D
        System.out.println("List contains C or not ? :" + hashSet.contains("D"));

        if(ra == b2){
            System.out.println("Same value ");

        }else{
            System.out.println("different value");

        }
        // Remove the value
        hashSet.remove("A");
        System.out.println("Remove hash Set "+ hashSet);

        // Display all the hash set
        for(String item: hashSet){
            System.out.println(item);
        }



    }
}
