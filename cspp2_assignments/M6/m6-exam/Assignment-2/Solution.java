import java.util.Scanner;
/**
 * Write a java program to round the elements of a matrix to the nearest 100.
 *
 * @author : MurthyVemuri
 */
final class Solution {
    /**
     * { var_description }.
     */
    private static final int HUNDERED = 100;
    /**
     * { var_description }.
     */
    private static final int FIFTY = 50;
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }

    /**
     * { function_description }.
     *
     * @param      element  The element
     *
     * @return     { description_of_the_return_value }
     */
    public static int roundHundred(final int element) {
        int temporary = element;
        int number = element / HUNDERED;
        int rem = element % HUNDERED;
        if (rem <= FIFTY) {
            temporary = number * HUNDERED;
        } else {
            temporary = (number + 1) * HUNDERED;
        }
        return temporary;
    }
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    public static int[][] roundHundred(final int[][] a,
                                        final int rows, final int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = roundHundred(a[i][j]);
            }
        }
        return a;
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}
