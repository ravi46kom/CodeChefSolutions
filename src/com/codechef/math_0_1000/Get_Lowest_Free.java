package com.codechef.math_0_1000;

import java.util.Scanner;

public class Get_Lowest_Free {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println((a + b + c) - (Math.min(a, Math.min(c, b))));
		}
	}

}
