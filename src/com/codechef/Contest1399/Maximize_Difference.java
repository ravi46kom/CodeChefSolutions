package com.codechef.Contest1399;

import java.util.Scanner;

public class Maximize_Difference {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			if (m < 2 * n) {
				System.out.println(m + " " + m);
			} else if (m >= 2 * n && m % n == 0) {
				System.out.println(n + " " + m);

			} else {
				int size = m / 2;
				if (m > 2 * n) {
					size = 2 * n;
				}
				int a = 0;
				int b = 0;
				int max = 0;
				for (int i = n; i <= size; i++) {
					if (Math.abs(i - (m - (m % i))) > max) {
						max = Math.abs(i - (m - (m % i)));
						a = i;
						b = (m - (m % i));
					}
				}
				System.out.println(a + " " + b);

			}
		}
	}

}
