package com.codechef.Contest1399;

import java.util.Scanner;

public class End_Sorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] p = new int[n];
			int x = 0;
			int y = 0;
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
				if (p[i] == 1) {
					x = i;
				}
				if (p[i] == n) {
					y = i;
				}
			}
			int result = ((x == 0) && (y == n - 1)) ? 0
					: ((x == 0) && (y != n - 1) ? n - 1 - y : ((x != 0) && (y == n - 1) ? x : n - 1 - y + x));
			if (x > y) {
				result -= 1;
			}
			System.out.println(result);
		}
	}

}
