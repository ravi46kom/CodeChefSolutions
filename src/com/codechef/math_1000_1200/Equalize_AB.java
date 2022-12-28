package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Equalize_AB {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int x = s.nextInt();
			System.out.println((b - a) % (2 * x) == 0 ? "YES" : "NO");
		}
	}

}
