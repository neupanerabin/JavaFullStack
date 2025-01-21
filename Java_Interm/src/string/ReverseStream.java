package string;


/*
 * @author : rabin
 */

public class ReverseStream {
    public static void main(String[] args) {
        System.out.println(reverseString("apple"));
        System.out.println(reverseString("rabin"));
        System.out.println(reverseString("122456"));
    }

    public static String reverseString(String string){
        // create variable to store reversed version of string
        StringBuilder stri = new StringBuilder();

        // iterate over input string from the back and use charAt() to get single char
        for(int i = string.length() - 1; i>=0; i--){
            stri.append(string.charAt(i));
        }

        // convert to string and return reversed string
        return stri.toString();
    }

}
