package string;


/*
 * @author : rabin
 */

// Write a method that accepts one string and returns it without duplicates.

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate {
    public static void main(String[] args) {
        System.out.println(removeDupliucate("apple and orrangess "));
    }

    // Solution 1
   /* public static String removeDupliucate(String str){
        StringBuilder strNoDuplicate = new StringBuilder();

        // loop over string and get each char
        for(char ch:str.toCharArray()){
            // if strNoDuplicate does not contain char then add to it
            if(!strNoDuplicate.toString().contains(String.valueOf(ch))){
                strNoDuplicate.append(ch);
            }
        }
        return strNoDuplicate.toString();

    }*/

    // Solution 2

    public static String removeDupliucate(String str){
        StringBuilder strDuplicate = new StringBuilder();

        // convert str to character[]
        char[] letters = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();

        // add each letter to set. It will remove duplicates - Set does not allow duplicate
        for(char ch: letters){
            set.add(ch);
        }

        // put back to String from Set
        for(Character ch:set){
            strDuplicate.append(ch);

        }
        return strDuplicate.toString();

    }

}
