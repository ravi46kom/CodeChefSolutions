package com.codechef.Contest1599;

import java.util.Scanner;

public class Cost_of_Groceries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int x = s.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				b[i] = s.nextInt();
				if (a[i] >= x) {
					sum += b[i];
				}
			}
			System.out.println(sum);
		}
	}

}
