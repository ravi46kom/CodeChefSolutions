package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Chef_and_Subarrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			int count = 0;
			for (int i = 0; i < n; i++) {

				for (int j = i; j < n; j++) {
					int sum = 0, prod = 1;
					for (int k = i; k <= j; k++) {
						sum += a[k];
						prod *= a[k];
					}
					count += prod == sum ? 1 : 0;
				}
			}
			System.out.println(count);
		}
	}

}
