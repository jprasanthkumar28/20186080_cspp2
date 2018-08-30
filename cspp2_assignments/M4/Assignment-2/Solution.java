/**
 *@author Prasanth...
*/
import java.util.Scanner;
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
     * @param args is the parameter for this function
    */
    /**
     * Fill the main function to print resultant of addition of matrices
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] sum = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }
        int m1 = s.nextInt();
        int n1 = s.nextInt();
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                b[i][j] = s.nextInt();
            }
        }
        if((m == m1 && n == n1)) {
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                // System.out.print(sum[i][j] + " ");
            }
            // System.out.println(sum[i][j]);
        }
        for (i = 0; i <= m - 1; i++) {
            for (j = 0; j < n - 1; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(sum[i][j]);
        }
    } else {
        System.out.println("not possible");
    }
        // for (int i = 0; i < m; i++) {
        // System.out.println(Arrays.toString(sum[i]));         
        // }

    }
}