package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Naive_Chef {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int countA = 0;
			int countB = 0;
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				if (a == arr[i]) {
					countA++;
				} if (b == arr[i]) {
					countB++;
				}
			}
			double p_a =(double) countA/n;
			double p_b = (double)countB/n;
			System.out.println(String.format("%.10f", p_b*p_a));
		}
	}

}
