package com.codechef.Contest1399;

import java.util.Scanner;

public class Permutation_GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			if (x < n) {
				System.out.println(-1);
				continue;
			}
			System.out.print((x - n + 1) + " ");

			for (int i = n; i > 0; i--) {
				if (i != x - n + 1) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

	}

}
