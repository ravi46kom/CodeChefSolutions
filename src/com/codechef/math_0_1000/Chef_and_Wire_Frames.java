package com.codechef.math_0_1000;

import java.util.Scanner;

public class Chef_and_Wire_Frames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int x = sc.nextInt();
			int res = ((2 * n) + (2 * m)) * x;
			System.out.println(res);
		}
	}

}
