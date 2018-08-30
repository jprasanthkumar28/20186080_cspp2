import java.util.Scanner;
/**
 *@author Prasanth...
*/
public final class FirstLast6 {
    /**
     * Empty Constructor.
     */
    private static final int VALUE = 6;
    /**
     * Constructs the object.
     */
    private FirstLast6() {
        //Iam not using this constructor
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
            // System.out.println(Arrays.toString(a));
        }
            if (a[0] == VALUE || a[n - 1] == VALUE) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
    }
}