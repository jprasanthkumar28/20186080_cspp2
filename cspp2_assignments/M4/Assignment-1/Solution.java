import java.util.Arrays;
import java.util.Scanner;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] array = new int[n];
		int big = 0;
		for (int i = 0; i < array.length; i++ ) {
			array[i] = sc.nextInt();
			if (array[i] > big) {
				big = array[i];
			}
			// System.out.println(Arrays.toString(array));
		}
		System.out.println(big);
		

	}
}
