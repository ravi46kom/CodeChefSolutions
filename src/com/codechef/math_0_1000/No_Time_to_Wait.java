package com.codechef.math_0_1000;

import java.util.Scanner;

public class No_Time_to_Wait {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int[] t = new int[n];
		int flag = 0;
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			if (h - x <= t[i]) {
				flag = 1;
			}
		}
		System.out.println(flag == 1 ? "Yes" : "No");

	}

}
