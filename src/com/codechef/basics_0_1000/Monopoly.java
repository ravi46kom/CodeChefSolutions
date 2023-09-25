package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Monopoly {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			int sum = a + b + c + d;
			System.out.println(sum - a < a || sum - b < b || sum - c < c || sum - d < d ? "YES" : "NO");
		}
	}

}
