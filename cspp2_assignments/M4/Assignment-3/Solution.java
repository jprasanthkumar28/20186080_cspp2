// Given an String, Write a java method that returns the decimal
// value for the given binary string.
import java.util.Scanner;
/**
 *@author Prasanth...
*/
public class Solution {
    /**
    Do not modify the main function.
    */
    private Solution() {
        //Iam not using this constructor
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			long res = binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
	public static long binaryToDecimal(final String value) {
		double  result;
		int sum = 0;
		int p = value.length() - 1;
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) != '0') {
				result = Math.pow(2, p);
				sum += result;
			}
			p = p - 1;
		}
		return sum;
	}

}
