import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
// import java.lang.StringBuffer;
import java.io.File;
import java.io.FileReader;


/**
 * Class for frequency.
 */
class Frequency {

    /**
     * Constructs the object.
     */
    protected Frequency() {

    }
    /**
     * Removes all.
     *
     * @param      text  The text
     *
     * @return     { description_of_the_return_value }
     */
    public static Map removeAll(final String text) {
        String[] wordList =
        text.replaceAll("[^a-zA-Z. ]", "").toLowerCase().split(" ");

        //System.out.println(Arrays.toString(wordList1));
        //return Arrays.toString(wordList1);
        Map<String, Integer> map = new HashMap<>();
        int freq = 0;
        for (int i = 0; i < wordList.length; i++) {
            if (!map.containsKey(wordList[i])) {
                map.put(wordList[i], 1);
            } else {
                map.put(wordList[i], map.get(wordList[i]) + 1);
            }
        }
        return map;
    }

    /**.
     * { var_description }
     */
    private static final double HUNDRED = 100;
    /**
     * Returns a string representation of the object.
     *
     * @param      filename  The filename
     *
     * @return     String representation of the object.
     */
    public static String toString(final File filename) {
        String s = "";
        try {
            Scanner data = new Scanner(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            while (data.hasNext()) {
                sb.append(data.next());
                sb.append(" ");
            }
            data.close();
            s = sb.toString();
        } catch (Exception e) {
            System.out.println("no file");
        }
        return s;
    }
    /**.
     * { function_description }
     *
     * @param      s1    The s 1
     * @param      s2    The s 2
     *
     * @return     { description_of_the_return_value }
     */
    public static double similarString(final String s1, final String s2) {
        int rows = s1.length();
        int columns = s2.length();
        double stringLength = rows + columns;
        int[][] maximum = new int[rows + 1][columns + 1];
        int answer = 0;
        double similarity = 0;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                if (i == 0 || j == 0) {
                    maximum[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    maximum[i][j] = maximum[i - 1][j - 1] + 1;
                    //answer = max(answer, maximum[i][j]);
                } else {
                    maximum[i][j] = 0;
                }
                if (answer < maximum[i][j]) {
                    answer = maximum[i][j];
                }
            }
        }
        similarity = Math.round(((answer * 2)
            / stringLength) * HUNDRED) / HUNDRED;
        return (similarity * HUNDRED);
        }
}

/**
 * Class for solution.
 */
class Solution {
    /**
     * Constructs the object.
     */
    protected Solution() {

    }
    /**.
     * { var_description }
     */
    private static final double HUNDRED1 = 100;
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        try {
        Frequency f = new Frequency();
        Scanner sc = new Scanner(System.in);
        // String line = sc.next();
        File data = new File(sc.next());
        File[] listoffiles = data.listFiles();
        // for (File name:listoffiles) {
        //  System.out.println(name);
        // }
        double maximum = 0;
        String answer1 = "";
        int length = listoffiles.length;
        double[][] answer = new double[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    answer[i][j] = HUNDRED1;
                } else {
                answer[i][j] =
                Frequency.similarString(Frequency.toString(listoffiles[i]),
                    Frequency.toString(listoffiles[j]));
                if (maximum < answer[i][j]) {
                    maximum = answer[i][j];
                    answer1 = "Maximum similarity is in between "
                    + listoffiles[i].getName() + " and "
                    + listoffiles[j].getName();

                }
            }
            }
        }
        System.out.print("\t");
        for (int i = 0; i < length; i++) {
            System.out.print("\t" + listoffiles[i].getName());
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(listoffiles[i].getName() + "\t");
            for (int j = 0; j < length; j++) {
                System.out.print(answer[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println(answer1);
    } catch (Exception e) {
        System.out.println("Empty Directory");
    }
    }
}
