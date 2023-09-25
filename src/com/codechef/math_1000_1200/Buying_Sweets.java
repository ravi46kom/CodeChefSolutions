package com.codechef.math_1000_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Buying_Sweets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int x = s.nextInt();
			int[] a = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				sum += a[i];
			}
			Arrays.sort(a);
			int total = sum - a[0];
			System.out.println(((total / x) != sum / x) ? sum / x : -1);
		}
	}

}
