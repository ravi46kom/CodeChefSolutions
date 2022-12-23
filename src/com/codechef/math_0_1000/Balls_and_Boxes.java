package com.codechef.math_0_1000;

import java.util.Scanner;

public class Balls_and_Boxes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int i = 0; i < t; i++) {
			int n = s.nextInt();
			int k = s.nextInt();
			String res = (k * (k + 1)) / 2 <= n ? "YES" : "NO";
			System.out.println(res);
		}
	}

}
