package com.codechef.sorting_1000_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Convert_to_permutation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			Arrays.sort(a);
			int sum = 0;
			boolean flag = false;
			for (int i = 0; i < n; i++) {
				if (a[i] > i + 1) {
					flag = true;
					break;
				}
				sum += a[i];
			}
			int actSum = (n * (n + 1)) / 2;
			System.out.println(flag ? -1 : actSum - sum);

		}
	}

}
