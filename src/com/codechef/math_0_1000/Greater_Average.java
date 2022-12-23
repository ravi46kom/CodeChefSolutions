package com.codechef.math_0_1000;

import java.util.Scanner;

public class Greater_Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			double res = (double) (a + b) / 2;
			System.out.println((res > c) ? "YES" : "NO");
		}
	}

}
