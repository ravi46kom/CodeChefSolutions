package com.codechef.math_0_1000;

import java.util.Scanner;

public class Minimum_number_of_Flips {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int sum = 0;
			int[] a = new int[n];
			int count = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			if(n %2 == 0) {
				if(sum == 0) {
					System.out.println(0);
				}else {
					System.out.println(Math.abs(sum/2));

				}
			}else {
				System.out.println(-1);
			}
		}
	}

}
