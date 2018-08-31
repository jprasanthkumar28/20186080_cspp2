// import java.io.*;
import java.util.Scanner;
/**
 *@author Prasanth...
*/
public final class Concatinate {
    /**
     * Empty Constructor.
     */
    private Concatinate() {
        //Iam not using this constructor
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        String greet = "Hello ";
        Scanner s = new Scanner(System.in);
        String sname = s.nextLine();
        for (int i = 0; i < sname.length(); i++) {
            // greet += sname.charAt(i);
            greet = greet.concat(String.valueOf(sname.charAt(i)));
        }
        System.out.println(greet);

    }
}
