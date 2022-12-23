package com.codechef.basics_1400_1500;

import java.util.Scanner;

public class Alternating_subarray_prefix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] result = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			result[n - 1] = 1;
			for (int i = n - 2; i >= 0; i--) {
				if (a[i] > 0 && a[i + 1] < 0 || a[i] < 0 && a[i + 1] > 0) {
					result[i] = result[i + 1] + 1;
				} else {
					result[i] = 1;
				}
			}
			for (int i = 0; i < n; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
		}
	}

}
