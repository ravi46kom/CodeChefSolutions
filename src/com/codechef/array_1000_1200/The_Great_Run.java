package com.codechef.array_1000_1200;

import java.util.Scanner;

public class The_Great_Run {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int k = s.nextInt();
			int total = 0;
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			if (k >= n) {
				for (int i = 0; i < n; i++) {
					total += a[i];
				}
			} else {
				for (int i = 0; i < n; i++) {
					int sum = 0;
					if (i + k <= n) {
						for (int j = i; j < i + k; j++) {
							sum += a[j];
						}
					}
					total = Math.max(total, sum);
				}
			}

			System.out.println(total);

		}
	}

}
