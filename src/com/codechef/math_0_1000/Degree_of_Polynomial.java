package com.codechef.math_0_1000;

import java.util.Scanner;

public class Degree_of_Polynomial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int deg = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if (a[i] != 0) {
					deg = i;
				}
			}
			System.out.println(deg);

		}

	}

}
