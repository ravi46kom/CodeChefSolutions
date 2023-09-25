package com.codechef.math_1000_1200;

import java.util.Scanner;

public class The_Attack_of_Queen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println((2 * (n - 1)) + Math.min(x - 1, y - 1) + Math.min(n - x, y - 1) + Math.min(x - 1, n - y)
					+ Math.min(n - x, n - y));
		}

	}

}
