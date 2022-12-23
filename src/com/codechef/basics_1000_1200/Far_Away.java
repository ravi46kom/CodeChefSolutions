package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Far_Away {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int m = s.nextInt();
			int[] a = new int[n];
			long d = 0;
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				d += Math.max(m - a[i], a[i] - 1);
			}
			System.out.println(d);
		}
	}

}
