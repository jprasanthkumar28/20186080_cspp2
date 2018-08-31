// Given an String, Write a java method that returns the decimal value for the given binary string.
import java.util.Scanner;
/**
 *@author Prasanth...
*/
public final class Solution
{
    /**
    Do not modify the main function
    
    @param      args  The arguments
    */
    private Solution() {
        //Iam not using this constructor
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args)
    {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String reverse=reverseString(s);    
        System.out.println(reverse);
        
    }
    /**
     * { function_description }
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static String reverseString(final String s) {
        
        String temp = "";
        for (int i = s.length()-1; i >= 0; i--) { 
            temp = temp + s.charAt(i);
        }
        return temp;
    }
}
