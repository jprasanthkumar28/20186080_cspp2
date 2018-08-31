
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i <= n; i++){
			int s = sc.nextInt();
			int res = binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
	public static int binaryToDecimal(int value) {
		int decimal = 0;
		int p = 0;
		while(true) {
			if(value == 0) {
				break;
			} else {
				int temp = value % 10;
				decimal += temp*Math.pow(2,p);
				value = value / 10;
				p++;
			}
		}
		return decimal;
	}
}
