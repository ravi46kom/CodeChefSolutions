package com.codechef.Contest1599;

import java.util.Scanner;

public class Snapchat {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			int count = 0;
			int max = 0;
			for (int i = 0; i < n; i++) {
				b[i] = s.nextInt();
				if (a[i] > 0 && b[i] > 0) {
					count++;
				} else {
					max = Math.max(max, count);
					count = 0;
				}
				max = Math.max(max, count);
			}
			System.out.println(max);
		}
	}

}
