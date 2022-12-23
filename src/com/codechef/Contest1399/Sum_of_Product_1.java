package com.codechef.Contest1399;

import java.util.Scanner;

public class Sum_of_Product_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			long sum = 0;
			long pro = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if (a[i] == 0) {
					pro = 0;
				} else {
					pro++;
					sum += pro;

				}

			}
			System.out.println(sum);
		}

	}

}
