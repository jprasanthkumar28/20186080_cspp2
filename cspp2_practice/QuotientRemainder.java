/**
 *@author Prasanth!!!
*/
public final class QuotientRemainder {
    /**
     * Empty Constructor.
    */
    private QuotientRemainder() {
        //Iam not using this constructor
    }
    /**
     * Main function to print.
     * @param args is the parameter for this function
    */
    public static void main(final String[] args) {
        int a = 10;
        int b = 3;
        int rem = a % b;
        int quo = a / b;
        System.out.println("remainder is--->" + rem);
        System.out.println("Quotient is --->" + quo);
    }
}
