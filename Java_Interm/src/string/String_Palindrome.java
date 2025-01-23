package string;


/*
 * @author : rabin
 */

/*
* A palindrome is a word, phrase, number, or sequence of words hat reads the same backward as forward
* */

public class String_Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("apple"));
        System.out.println(isPalindrome("lol"));

    }

    public static boolean isPalindrome(String str){
        // use two pointers, one pointer will start from beginning
        // another from the back. If values of pointers are not equal, then return false
        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            // if pointers are not equal return false
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }

}
