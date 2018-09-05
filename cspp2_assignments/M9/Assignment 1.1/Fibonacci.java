import java.util.Scanner;
/**
 * @author Prasanth...
 */
/**
 * In the previous module you have created List ADT. ADTs are developed as
 * reusable libraries i.e., anyone who needs the ADT can use it in their program
 * A program that uses the ADT is called a "client" of the ADT The client
 * typically instantiates an object of the ADT and invokes the public methods on
 * the ADT object.
 *
 * This assignment is to practice the idea of client to the ADT. Client class is
 * Fibonacci and the client needs to use the List ADT to store fibonacci numbers
 * in the List ADT. So, Fibonacci is going to instantiate an object of List ADT
 * generate fibonacci numbers and add them to the list by invoking the add
 * method provided in the List ADT.
 */

/**
 * Class for fibonacci.
 */
public class Fibonacci {
    /**
     * fib is a static method takes a argument n n is the count of the fibonacci
     * numbers to be generated. The method returns a List with the n fibonacci
     * numbers.
     *
     * Look for the hint.txt if some of the testcases fail.
     */
    private static int f = 0;
    /**
     * { var_description }.
     */
    private static int s = 1;
    /**
     * { function_description }.
     *
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static List fib(final int n) {
        // todo - complete this method
        List l = new List(n);
        for (int i = 1; i <= n; i++) {
            l.add(f);
            int t = f + s;
            f = s;
            s = t;
        }
        return l;
    }

    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        System.out.println(fib(n));
    }
}