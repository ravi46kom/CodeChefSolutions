package com.codechef.sorting_1000_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Chef_and_Eid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] v = new int[n];
			for (int i = 0; i < n; i++) {
				v[i] = s.nextInt();
			}
			int min = Integer.MAX_VALUE;
			Arrays.sort(v);
			for (int i = 1; i < n; i++) {
				min = Math.min(min, v[i] - v[i - 1]);
			}
			System.out.println(min);
		}
	}

}
