package array;


/*
 * @author : rabin
 */

public class Missing_Number {
    public static void main(String[] args) {

        int total;
        int num[] = new int[]{1,2,4,5,6,7};

        total = 7;
        // 1. Calculate A = n (n+1)/2 where n is largest number in series 1…N.
        int sum = total * ((total + 1)/2);
        int num_sum = 0;

        // 2. Calculate B = Sum of all numbers in given series
        for(int i:num){
            num_sum +=i;
        }
        // Missing number = A-B
        System.out.println(sum-num_sum);

    }
}
