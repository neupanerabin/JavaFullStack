package array;


/*
 * @author : rabin
 */

// Return the min max number of given array
public class MinMax_Number {
    public static void main(String[] args) {
        System.out.println(maxNumber(new int[] {4, 6,1, 12,3, 4}));
        System.out.println(maxNumber(new int[] {14, 56,1, 12,3, 49}));


    }

    public static int maxNumber(int[] arrayNumber){
        // assume first element of the array is the biggest
        int max = arrayNumber[0];

        // loop over the array and test our above assumption
        for(int num: arrayNumber){
            // if max was not the biggest number, update it
            if(max< num){
                max = num;
            }
        }
        return max;
    }
}
