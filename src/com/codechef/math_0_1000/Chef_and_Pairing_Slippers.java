package com.codechef.math_0_1000;

import java.util.Scanner;

public class Chef_and_Pairing_Slippers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int l = sc.nextInt();
			int x = sc.nextInt();
			System.out.println(Math.min(l, n - l) * x);
		}
	}

}
