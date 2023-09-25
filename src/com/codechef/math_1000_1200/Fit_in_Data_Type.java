package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Fit_in_Data_Type {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int x = s.nextInt();

			System.out.println((n < x) ? x % (n + 1) : x);

		}
	}

}
