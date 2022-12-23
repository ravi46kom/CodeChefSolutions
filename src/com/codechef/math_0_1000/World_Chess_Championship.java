package com.codechef.math_0_1000;

import java.util.Scanner;

public class World_Chess_Championship {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			String str = sc.next();
			int d = 0;
			int n = 0;
			int c = 0;
			for (int i = 0; i < 14; i++) {
				if (str.charAt(i) == 'D') {
					d++;
				} else if (str.charAt(i) == 'C') {
					c++;
				} else {
					n++;
				}
			}
			System.out.println(c * 2 + d > n * 2 + d ? 60 * x : (c * 2 + d < n * 2 + d ? 40 * x : 55 * x));
		}
	}

}
