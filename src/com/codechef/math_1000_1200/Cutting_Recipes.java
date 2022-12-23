package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Cutting_Recipes {
	static int hcf(int a, int b) {
		if (a == 0)
			return b;
		return hcf(b % a, a);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			int gcd = 1;
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
				if (i == 0) {
					gcd = arr[i];
				}
				gcd = hcf(gcd, arr[i]);
			}
			boolean flag = true;
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {

				if (arr[i] % gcd == 0) {
					res[i] = arr[i] / gcd;
				} else {
					flag = false;
					break;
				}
			}
			if (flag) {
				for (int i = 0; i < n; i++) {
					System.out.print(res[i] + " ");
				}
				System.out.println();
			} else {
				for (int i = 0; i < n; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}
		}
	}

}
