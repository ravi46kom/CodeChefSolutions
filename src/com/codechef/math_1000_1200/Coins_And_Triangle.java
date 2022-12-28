package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Coins_And_Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int height = 0;
			boolean flag = false;
			int h = 0;
			for (h = 1; h <= n; h++) {
				height = (h * (h + 1)) / 2;
				if (height == n) {
					flag = true;
					break;
				} else if (height > n) {
					break;
				}
			}
			System.out.println(flag ? h : h - 1);
		}
	}

}
