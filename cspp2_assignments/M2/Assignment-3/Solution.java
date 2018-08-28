import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /*
    Do not modify this main function.
    */
      /**
     * Empty Constructor.
    */
    private Solution() {
        //Iam not using this constructor
    }
    /**
     * Main function to print.
     * @param args is the parameter for this function
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /*
    Need to write the power function and print the output.
    */
    /**
     * { function_description }.
     *
     * @param      b     { parameter_description }
     * @param      e     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static long power(final int b, final int e) {
        if (e > 0) {
            return b * power(b, e - 1);
        }
        return 1;
    }
}
