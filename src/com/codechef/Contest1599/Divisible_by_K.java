package com.codechef.Contest1599;

import java.math.BigInteger;
import java.util.Scanner;

public class Divisible_by_K {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			BigInteger k = s.nextBigInteger();
			long[] a = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			boolean flag = false;
			for (int i = 0; i < n; i++) {
				if (flag) {
					break;
				}
				for (int j = i; j < n; j++) {
					BigInteger prod = BigInteger.ONE;
					if (flag) {
						break;
					}
					for (int l = i; l <= j; l++) {
						prod = prod.multiply(BigInteger.valueOf(a[l]));
					}
					prod = prod.mod(k);
					int val = prod.intValue();
					if (val == 0) {
						flag = true;
						break;
					}
				}
			}
			System.out.println(flag ? "YES" : "NO");

		}
	}

}
