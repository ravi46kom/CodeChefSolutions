package com.codechef.sorting_1000_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Lazy_Salesman {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int w = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			Arrays.sort(a);
			int val = 0;
			int count = 0;
			for (int i = n - 1; i >= 0; i--) {
				val += a[i];
				count++;
				if (val >= w) {
					System.out.println(n - count);
					break;
				}
			}

		}
	}

}
