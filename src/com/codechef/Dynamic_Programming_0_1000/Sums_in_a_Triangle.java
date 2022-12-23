package com.codechef.Dynamic_Programming_0_1000;

import java.util.Scanner;

public class Sums_in_a_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			int[][] result = new int[n][n];
			for (int i = 0; i < n; i++) {
				result[n - 1][i] = a[n - 1][i];
			}
			for (int i = n - 2; i >= 0; i--) {
				for (int j = 0; j <= i; j++) {
					result[i][j] = a[i][j] + Math.max(result[i + 1][j], result[i + 1][j + 1]);
				}
			}
			System.out.println(result[0][0]);
		}
	}

}
