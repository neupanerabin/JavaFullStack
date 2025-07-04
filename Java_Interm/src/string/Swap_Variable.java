package string;


/*
 * @author : rabin
 */

/*
Write a program to swap two string variables without using temp variable
 */
public class Swap_Variable {
    public static void main(String[] args) {

        // declare two string
        String a = "Hello";
        String b = "world";

        // append the strings
        a = a+b;

        // store initial string a in string b
        b = a.substring(0, a.length()- b.length());

        // store initial string b in string a
        a = a.substring(b.length());

        System.out.println("After swap: \n"+
                a +" " + b);

    }
}
