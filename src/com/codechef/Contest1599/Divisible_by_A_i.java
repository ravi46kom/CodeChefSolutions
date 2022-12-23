package com.codechef.Contest1599;

import java.util.Scanner;

public class Divisible_by_A_i {
	static int findGcd(int a, int b) {
		if (a == 0)
			return b;
		return findGcd(b % a, a);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			int gcd = 0;
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				gcd = findGcd(gcd, a[i]);
			}
			for (int i = 0; i < n; i++) {
				System.out.print(a[i] / gcd + " ");
			}
			System.out.println();
		}

	}

}
