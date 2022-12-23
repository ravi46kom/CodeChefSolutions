package com.codechef.math_0_1000;

import java.util.Scanner;

public class Too_many_Floors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int x_f = x % 10 > 0 && x > 10 ? (x / 10) + 1 : (x % 10 == 0) ? (x / 10) : 1;
			int y_f = y % 10 > 0 && y > 10 ? (y / 10) + 1 : (y % 10 == 0) ? (y / 10) : 1;
			System.out.println(Math.abs(x_f - y_f));

		}
	}

}
