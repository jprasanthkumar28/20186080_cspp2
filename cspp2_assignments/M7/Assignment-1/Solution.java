import java.util.Scanner;
/**
 * @author Prasanth...
 */
class InputValidator {
    /**
     * Write the atrributes and methods for InputValidator.
     */
    private String input;
    /**
     * Constructs the object.
     *
     * @param      str   The string
     */
    InputValidator(final String str) {
        this.input = str;
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    boolean validateData() {
        int len = input.length();
        final int length = 6;
        if (len >= length) {
            return true;
        }
        return false;
    }
}
/**
 * Class for Solution.
 */
public final class Solution {
   /**
    * Construction.
    */
    private Solution() {

    }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}
