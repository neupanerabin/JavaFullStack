package array;


/*
 * @author : rabin
 */

/*
    Program to move all zeroes to end of array
 */
public class Move_Zero_End {

    public static void  pushZeroToEnd(int arr[], int n){

        int count = 0;

        // Traverse the array, If the element is encountered
        // non-zero, then replace the element at index 'count'
        // with the element
        for(int i=0; i<n; i++){
            if(arr[i] != 0)
                arr[count++] = arr[i]; // Place non-zero element at 'count' and increment 'index'
        }
        /*
        Now all non-zero elements have been shifted to front and 'count'
        is set as index of first 0.
        Make all elements 0 from count to end
         */
        // Fill remaining positions with zeroes
        while(count < n)
            arr[count++] = 0;

    }


    public static void main(String[] args) {

        int arr[] = {0,1,2,0,5,4,0,8};
        int n = arr.length;

        System.out.println("Array after pushing zeroes to the back: ");
        pushZeroToEnd(arr,n);

        for(int i =0; i<n; i++){
            System.out.println(arr[i]+" ");


        }

    }
}
