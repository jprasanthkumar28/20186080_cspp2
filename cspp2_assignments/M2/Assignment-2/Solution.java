import java.util.Scanner;
// import java.lang.Math;
/**
 * @author Prasanth!!
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

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        quadraticEqu(a, b, c);
    }

    /**
     * { function_description }.
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    public static void quadraticEqu(final int a, final int b, final int c) {
        int var1 = (b * b) - (2 * 2 * a * c);
        double root1 = ((-b) + Math.sqrt(var1)) / (2 * a);
        double root2 = ((-b) - Math.sqrt(var1)) / (2 * a);
        System.out.println(root1 + " " + root2);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
}


