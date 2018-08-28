import java.util.Scanner;
/**
 *@author Prasanth...
 */
public final class Factorial {
    /*
    Do not modify this main function.
    */
    /**
     * Empty Constructor.
    */
    private Factorial() {
        //Iam not using this constructor
    }
    /**
     * Main function to print.
     * @param args is the parameter for this function
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int factorial = fact(number);
        System.out.println(factorial);
    }
    /**
     * { function_description }.
     *
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static int fact(final int n) {

        if ((n == 0) || (n == 1)) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
