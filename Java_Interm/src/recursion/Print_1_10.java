package recursion;

/*
 * @author : rabin
 */

public class Print_1_10 {

    public static void recusrions(int number) {
        if (number > 10) {
            return ; // Base case: stop if number exceeds 10
        } else {

            System.out.println(number); // Print the current number
            recusrions(number + 1); // Recursive call with the next number
        }
    }

    public static void main(String[] args) {
        System.out.println("Display: 10 numbers: ");
        recusrions(1); // Start recursion with the number 1

    }
}
