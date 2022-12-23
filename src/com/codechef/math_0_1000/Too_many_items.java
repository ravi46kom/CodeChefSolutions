package com.codechef.math_0_1000;

import java.util.Scanner;

public class Too_many_items {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(n % 10 > 0 ? (n / 10) + 1 : n / 10);
		}
	}

}
