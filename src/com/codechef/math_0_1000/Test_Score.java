package com.codechef.math_0_1000;

import java.util.Scanner;

public class Test_Score {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int x = s.nextInt();
			int y = s.nextInt();
			String res = (n * x >= y && y % x == 0) ? "Yes" : "No";
			System.out.println(res);
		}
	}

}
