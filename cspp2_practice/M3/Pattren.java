/**
 *@author Prasanth...
*/
public final class Pattren {
    /**
     * Empty Constructor.
     */
    private static final int MAXVALUE = 5;
    /**
     * Constructs the object.
     */
    private Pattren() {
        //Iam not using this constructor
    }
    /**
     * Main function to print.
     * @param args is the parameter for this function
    */
    public static void main(final String[] args) {
        int i;
        for (i = 1; i < MAXVALUE; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
