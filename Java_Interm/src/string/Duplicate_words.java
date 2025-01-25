package string;


/*
 * @author : rabin
 */
/*
* Function to find out duplicate words in a given string
* */
public class Duplicate_words {
    public static void main(String[] args) {
        // Define string
        String duplicate_word = "Big black dock bug big black duck bug";
        int count;
        // convert string to lowercase
        duplicate_word = duplicate_word.toLowerCase();

        // split the words
        String words[] = duplicate_word.split(" ");

        System.out.println("Duplicate words are" );
        for(int i=0; i<words.length;i++){
            count = 1;
            for(int j=i+1; j<words.length; j++){
                if(words[i].equals(words[j])){
                    count++;
                    System.out.println(words[i]);
                    // set words[j] to 0 to avoid printing visited word
                   // words[j] = "0";
                }
            }
            // Display the duplicate word if count is greater than 1
           // if(count >1 && words[i] != "0")
                //System.out.println(words[i]);
        }
    }



}
