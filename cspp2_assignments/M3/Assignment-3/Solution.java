import java.util.Scanner;
/**
 * @author Prasanth...
*/
public final class Solution {
    /**
     * Empty Constructor.
     */
    private Solution() {
        //Iam not using this constructor.
    }
    /**
     * Main function to print.
     *
     * @param      args  is the parameter for this function
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int ans = gcd(n1, n2);
        System.out.println(ans);
    }
    /**
     * { function_description }.
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static int gcd(final int a, final int b) {

        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }
    /*
    Need to write the gcd function and print the output.
    */
}
