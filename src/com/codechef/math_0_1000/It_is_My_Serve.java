package com.codechef.math_0_1000;

import java.util.Scanner;

public class It_is_My_Serve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			System.out.println((p + q+1) % 4 == 1 | (p + q+1) % 4 == 2 ? "Alice" : "Bob");

		}
	}

}
