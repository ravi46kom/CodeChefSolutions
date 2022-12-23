package com.codechef.Greedy_Algorithms_0_1000;

import java.util.Scanner;

public class First_and_Last {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			while (t-- > 0) {
				int n = sc.nextInt();
				int[] a = new int[n];
				int max = Integer.MIN_VALUE;
				for (int i = 0; i < n; i++) {
					a[i] = sc.nextInt();
					if (i > 0) {
						if (a[i] + a[i - 1] > max) {
							max = a[i] + a[i - 1];
						}
					}

				}
				if (a[0] + a[n - 1] > max) {
					max = a[0] + a[n - 1];
				}
				System.out.println(max);
			}
		}
	}

}
