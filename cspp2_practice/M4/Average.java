import java.util.Scanner;
/**
 *@author Prasanth...
*/
public final class Average {
    /**
     * Empty Constructor.
     */
    // private static final int MAXVALUE = 5;
    /**
     * Constructs the object.
     */
    private Average() {
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
        int sum = 0;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
            // System.out.println(Arrays.toString(a));
        }
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            // System.out.println(Arrays.toString(a));
        }
        int avg = sum / n;
        System.out.println(avg);
    }
}
