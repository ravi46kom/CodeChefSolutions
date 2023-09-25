package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Chef_vs_Doof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			boolean flag = false;
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 == 0) {
					flag = true;
					break;
				}
			}
			System.out.println(flag ? "NO" : "Yes");
		}

	}

}
