package com.codechef.math_0_1000;

import java.util.Scanner;

public class Marbles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextInt();
			long k = sc.nextInt();
			long res = 1;
			for (int i = 1; i < k; i++) {
				res = res* (n - k + i) / i;
			}
			System.out.println( res);

		}
	}

}
