package stack;


/*
 * @author : rabin
 */

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Nepal");
        stack.push("China");
        stack.push("India");

        System.out.println("Stack: "+ stack);


    }
}
