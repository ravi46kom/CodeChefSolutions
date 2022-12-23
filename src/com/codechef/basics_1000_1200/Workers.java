package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Workers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] c = new int[n];
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = s.nextInt();
		}
		long minAuth = Integer.MAX_VALUE;
		long minTrans = Integer.MAX_VALUE;
		long both = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			t[i] = s.nextInt();
			if (t[i] == 1) {
				minAuth = Math.min(minAuth, c[i]);
			}
			if (t[i] == 2) {
				minTrans = Math.min(minTrans, c[i]);
			}
			if (t[i] == 3) {
				both = Math.min(both, c[i]);
			}
		}
		System.out.println(Math.min(minTrans + minAuth, both));
	}

}
