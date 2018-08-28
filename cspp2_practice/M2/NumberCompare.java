import java.util.Scanner;
/**
 *@author Prasanth!!!
*/
public final class NumberCompare {
    /*
    Do not modify this main function.
    */
      /**
     * Empty Constructor.
    */
    private NumberCompare() {
        //Iam not using this constructor
    }
    /**
     * Main function to print.
     * @param args is the parameter for this function
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is Bigger than " + num2);
        } else if (num1 == num2) {
            System.out.println(num1 + "," + num2 + " are equal");
        } else {
            System.out.println(num1 + " is Smaller than " + num2);
        }
    }
}
