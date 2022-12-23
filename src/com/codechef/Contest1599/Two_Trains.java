package com.codechef.Contest1599;

import java.util.Scanner;

public class Two_Trains {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] p = new int[n - 1];
			
			for (int i = 0; i < n - 1; i++) {
				p[i] = sc.nextInt();
			}
			int time = p[0];
			int a = 0;
			int b = 0;
			for (int i = 0; i < n - 1; i++) {
				if (i - 1 >= 0) {
					a += p[i - 1];
					b += p[i - 1];
				} else {
					a += p[i];
				}
				if (a-b<p[i]) {
					time += p[i] - (a - b);
					a += p[i] - (a - b);
				}
				time += p[i];
			}
			System.out.println(time);
		}
	}

}
