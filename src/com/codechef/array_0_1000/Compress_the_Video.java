package com.codechef.array_0_1000;

import java.util.Scanner;

public class Compress_the_Video {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int count = 1;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if (i > 0) {
					if (a[i] != a[i - 1]) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

}
