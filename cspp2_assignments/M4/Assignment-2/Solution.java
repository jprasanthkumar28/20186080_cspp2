import java.util.*;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] a = new int[m][n];
		int[][] b = new int[m][n];
		int[][] sum = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = s.nextInt();
			}
		}
		int m1 = s.nextInt();
		int n1 = s.nextInt();
		for (int i = 0; i < m1; i++) {
			for (int j = 0; j < n1; j++) {
				b[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sum[i][j] = a[i][j] + b[i][j];
				System.out.println(sum[i][j]);
			}
		}
		// for (int i = 0; i < m; i++) {
		// System.out.println(Arrays.toString(sum[i]));			
		// }

	}
}