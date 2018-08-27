/**
 *@author Prasanth!!!
*/
public final class Swap {
    /**
     * Empty Constructor.
    */
    private Swap() {
        //Iam not using this constructor
    }
    /**
     * Main function to print.
     * @param args is the parameter for this function
    */
    public static void main(final String[] args) {
        int a = 4;
        int b = 10;
        System.out.println("Before Swap(a,b)--->" + a + ", " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap(a,b)--->" + a + ", " + b);
    }
}
