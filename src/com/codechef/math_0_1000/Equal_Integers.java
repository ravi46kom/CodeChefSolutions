package com.codechef.math_0_1000;

import java.util.Scanner;

public class Equal_Integers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(
					x == y ? 0 : x < y ? y - x : (x > y && (x - y) % 2 == 0) ? (x - y) / 2 : ((x - y) / 2) + 2);
		}
	}

}
