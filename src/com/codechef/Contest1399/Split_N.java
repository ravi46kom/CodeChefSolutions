package com.codechef.Contest1399;

import java.util.Scanner;

public class Split_N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int result = 0;
			while (n != 0) {
				int x = 1;
				while (x <= n) {
					x *= 2;
				}
				x /= 2;
				n -= x;
				result++;
			}
			System.out.println(result - 1);

		}
	}

}
