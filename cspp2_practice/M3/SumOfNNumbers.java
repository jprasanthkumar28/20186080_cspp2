import java.util.Scanner;
/**
 *@author Prasanth...
*/
public final class SumOfNNumbers {
    /**
     * Empty Constructor.
    */
    private SumOfNNumbers() {
        //Iam not using this constructor
    }
    /**
     * Main function to print.
     *
     * @param      args  is the parameter for this function
     */
    public static void main(final String[] args) {
        int i, sum = 0;
        // private static final double LASTVALUE = 10;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
