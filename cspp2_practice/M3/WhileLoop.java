/**
 *@author Prasanth...
*/
public final class WhileLoop {
    /**
     * Empty Constructor.
    */
    private static final double LASTVALUE = 10;
    /**
     * Constructs the object.
     */
    private WhileLoop() {
        //Iam not using this constructor
    }
    /**
     * Main function to print.
     *
     * @param      args  is the parameter for this function
     */
    public static void main(final String[] args) {
        int n = 2;
        while (n <= LASTVALUE) {
            System.out.println(n);
            n += 2;
        }
        System.out.println("GoodBye!");
    }
}
