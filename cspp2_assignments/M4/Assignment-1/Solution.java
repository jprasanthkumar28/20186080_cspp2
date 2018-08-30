// import java.util.Arrays;
import java.util.Scanner;
/**
 *@author Prasanth...
*/
public final class Solution {
    /**
     * Empty Constructor.
     */
    // private static final int MAXVALUE = 5;
    /**
     * Constructs the object.
     */
    private Solution() {
        //Iam not using this constructor
    }
    /**
     * Main function to print.
     * @param args is the parameter for this function.
    */
    /**
    Fill this main function to print maximum of given array
    @param      args  The arguments.
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int big = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] > big) {
                big = array[i];
            }
            // System.out.println(Arrays.toString(array));
        }
        System.out.println(big);
    }
}
