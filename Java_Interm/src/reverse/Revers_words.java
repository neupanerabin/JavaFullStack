package reverse;


/*
 * @author : rabin
 */

/*
     Write a method that will take a string as an argument.
     The method will reverse the position of words and return it
*/
public class Revers_words {
    public static void main(String[] args) {
        System.out.println(reveseWords("one two three"));

    }

    public static String reveseWords(String string){
        StringBuilder reverse = new StringBuilder();

        //split input string by "" space to get each words as String[]
        String[] words = string.split(" ");

        // loop over the array from back
        for(int i=words.length - 1; i>=0; i--){
            // add words to reverse with space
            reverse.append(words[i]).append(" ");
        }
        // trim needed to remove last space in the end
        return reverse.toString().trim();
    }
}
