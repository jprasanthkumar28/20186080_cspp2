import java.util.Scanner;
/**
 * @author     Prasanth...
 */
public final class Solution {
    /**
     * Empty Constructor.
     */
    private static final int TEN = 10;

    private static final int SEVEN = 7;
    /**
     * Constructs the object.
     */
    private Solution() {
        //Iam not using this constructor.
    }
/**
 * Fill the main function to print the number of 7's between 1 to n
 *
 * @param      args  The arguments
 */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0, count = 0, value = 0;
        while (i < n) {
           if (i % TEN == SEVEN) {
            count += 1;
           }
            i += 1;
        }
        // System.out.println(count);
        for (int j = 0; j < n; j++) {
            // System.out.println(j);
            int a = j / TEN;
            while (a > 0) {
              if (a % TEN == SEVEN) {
                value += 1;
            }
                a = a / TEN;
            }
            // System.out.println(n);
            if (a == SEVEN) {
                value += 1;
                // System.out.println(value);
            }

        }
        int result = count + value;
        System.out.println(result);
    }
}