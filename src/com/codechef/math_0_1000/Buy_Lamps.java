package com.codechef.math_0_1000;

import java.util.Scanner;

public class Buy_Lamps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int res = (k * x) + Math.min(((n - k) * y), ((n - k) * x));
			System.out.println(res);
		}
	}

}
