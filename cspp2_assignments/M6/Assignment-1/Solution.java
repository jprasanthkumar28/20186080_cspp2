import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author :Prasanth!!!!!
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
    // write your code here
        int count = 0;
        int i, j;
        for (i = 2; i < n; i++) {
                for (j = 2; j < i; j++) {
                    if ((i % 2 != 0) && (i % j == 0)) {
                        count += 1;
                        // System.out.println(i);
                        // System.out.println(count);
                        if (count > 0) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
        }
    }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}
