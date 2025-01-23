package reverse;


/*
 * @author : rabin
 */

//        Array reverse. Write a method that will take an array as an argument and reverse it.

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args){
        int[] inputArr = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(inputArr));
        revArr(inputArr);
        System.out.println(Arrays.toString(inputArr));
    }
    public static void revArr(int[] arr){
        // we will use two 'pointers'. One pointer will start from the beginning
        int start = 0;
        int end = arr.length - 1;

        while(start< end){
            // swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // increase start and decrease end
            start++;
            end--;
        }
    }
}
