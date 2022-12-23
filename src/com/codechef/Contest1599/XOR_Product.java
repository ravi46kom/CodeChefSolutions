package com.codechef.Contest1599;

import java.util.Scanner;

public class XOR_Product {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				min = min > a[i] ? a[i] : min;
			}
			int res = 0;
			int temp = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] % min == 0) {
					res++;
				} else {
					temp = 1;
					break;
				}
			}
			System.out.println(temp == 0 ? n : res);
		}
	}

}
