import java.util.Scanner;
/**
 * @author Prasanth...
*/
public final class Solution {
    /**
     * Empty Constructor.
     */
    private Solution() {
        //Iam not using this constructor.
    }
    /**
     * Main function to print.
     *
     * @param      args  is the parameter for this function
     */	
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(final String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        int i=0,count=0,value = 0;
  	    while(i<n) {
	       if(i % 10 == 7)
	       	count += 1;
	   		i += 1;
		}
  		// System.out.println(count);
		for (int j = 0; j < n; j++) {
			// System.out.println(j);
			int a = j / 10;
			// System.out.println(n);
			if (a == 7) {
				value += 1;
				// System.out.println(value);
			}
		}
		int result = count + value ;
        System.out.println(result);
    }
}