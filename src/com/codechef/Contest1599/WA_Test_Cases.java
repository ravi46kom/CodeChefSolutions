package com.codechef.Contest1599;

import java.util.Scanner;

public class WA_Test_Cases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] s = new int[n];
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
			}
			String v = sc.next();
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < v.length(); i++) {
				if (v.charAt(i) == '0') {
					min = Math.min(min, s[i]);
				}

			}
			System.out.println(min);
		}
	}

}
