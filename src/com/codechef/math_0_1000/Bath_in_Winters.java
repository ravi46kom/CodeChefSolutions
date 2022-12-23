package com.codechef.math_0_1000;

import java.util.Scanner;

public class Bath_in_Winters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println((2 * y) <= x ? x / (2 * y) : 0);
		}
	}

}
