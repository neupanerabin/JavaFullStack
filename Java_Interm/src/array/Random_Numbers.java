package array;


/*
 * @author : rabin
 */

// Program to generate the random integer
// within the specific range

import java.util.concurrent.ThreadLocalRandom;

public class Random_Numbers {

    public static int getRandomValue(int Min, int Max){
        // Get and return the random integer
        // within Min and Max
        return ThreadLocalRandom.current().nextInt(Min, Max + 1);
    }

    public static void main(String[] args) {
        int min =1;
        int max = 100;
        System.out.println("Random value between : "
         + min + " and "+ max +" :"
         + getRandomValue(min, max));

    }
}
