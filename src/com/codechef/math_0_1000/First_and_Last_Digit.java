package com.codechef.math_0_1000;

import java.util.Scanner;

public class First_and_Last_Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int sum = n % 10;
			int r = 0;
			while (n != 0) {
				r = n % 10;
				n /= 10;

			}
			System.out.println(sum + r);
		}
	}

}
