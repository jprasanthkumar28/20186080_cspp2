import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for set.
 * @author     : Prasanth...
 */
final class Set {
    //your code goes here...
    //Good luck :-)
    //set variable.
    /**
     * set variable.
     */
    private int[] set;
    /**
     * size variable.
     */
    private int size;
    /**
     * var 10.
     */
    private static final int TEN = 10;

    /**
     * Constructs the object for Set Class.
     */
    public Set() {
        size = 0;
        set = new int[TEN];
    }
    /**
     * to calculate the size of the set.
     *
     * @return     size of the set.
     */
    public int size() {
        return size;
    }

    /**
     * checks if item is present in set or not.
     *
     * @param      item  The item
     *
     * @return     boolean based on the item search.
     */
    public boolean contains(final int item) {
        for (int i = 0; i < size; i++) {
            if (set[i] == item) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (size == 0) {
            return "{}";
        }
        String str = "{";
        for (int i = 0; i < size - 1; i++) {
            str = str + set[i] + ", ";
        } str = str + set[size - 1] + "}";
        return str;
    }

    /**
     * add the values to set..
     *
     * @param      item  The item
     */
    public void add(final int item) {
        if (!contains(item)) {
            set[size] = item;
            size += 1;
        }
    }

    /**
     * add the set of values to set.
     *
     * @param      newSet  The new set
     */
    public void add(final int[] newSet) {
        for (int i: newSet) {
            add(i);
        }
    }

    /**
     * compares two sets.
     *
     * @param      newSet  The new set
     *
     * @return     the set that contains values in both sets.
     */
    public Set intersection(final Set newSet) {
        Set s1 = new Set();
        // int count = 0;
        for (int i = 0; i < size; i++) {
            if (newSet.contains(set[i])) {
                s1.add(set[i]);
            }
        }
        // for (int element = 0; element > size; element++) {
        //  for (int element1 : set) {
        //      if (contains(element) == contains(element1)) {
        //          s1.add(element1);
        //      }
        //  }
        // }
        return s1;
    }

    /**
     * retains all the values.
     *
     * @param      newSet  The new set
     *
     * @return     the set of values.
     */
    // retainAll [1,2,3,4,5] [1,4,3]
    // retainAll [] [1,4,3]
    // retainAll [1,2,3,4,5] []
    // retainAll [1,4,3] [1,4,3]
    // retainAll [1,2,3,4,5] [6,7,8]
    // retainAll [1] [1]

    public Set retainAll(final int[] newSet) {
        Set s2 = new Set();
            for (int i = 0; i < size; i++) {
                for (int element : newSet) {
                if (set[i] == element) {
                    s2.add(set[i]);
            }
            }
        }
        // for (int i = 0; i < size; i++) {
        //  if (newSet.contains(set[i])) {
        //      s2.add(set[i]);
        //  }
        // }
        return s2;
    }

    /**
     * cartisians the two sets.
     *
     * @param      newSet  The new set
     *
     * @return     the set of cartiseian product.
     */
    public int[][] cartesianProduct(final Set newSet) {
        // Set s3 = new Set();
        int[][] s3 = new int[TEN][TEN];
        int[][] s4 = new int[TEN][TEN];
        int i, j;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size - 1; j++) {
                s4[i][j] += s3[i][j];
            }
        }
        return s4;
    }

}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}
