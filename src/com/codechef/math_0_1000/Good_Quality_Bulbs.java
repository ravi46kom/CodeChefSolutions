package com.codechef.math_0_1000;

import java.util.Scanner;

public class Good_Quality_Bulbs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] a = new int[n - 1];
			int sum = 0;
			for (int i = 0; i < n - 1; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			System.out.println(sum >= n * x ? 0 : (n * x) - sum);
		}
	}

}
