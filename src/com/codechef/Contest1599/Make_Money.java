package com.codechef.Contest1599;

import java.util.Arrays;
import java.util.Scanner;

public class Make_Money {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int x = s.nextInt();
			int c = s.nextInt();
			int[] a = new int[n];
			int max = 0;
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				if (a[i] < x-c && x > c) {
					a[i] = x - c;
				}
				max += a[i];
			}
			System.out.println(max);
		}
	}

}
