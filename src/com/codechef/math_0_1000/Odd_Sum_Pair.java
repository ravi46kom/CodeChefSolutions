package com.codechef.math_0_1000;

import java.util.Scanner;

public class Odd_Sum_Pair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			String res = (a + b) % 2 != 0 ? "YES" : (a + c) % 2 != 0 ? "YES" : (b + c) % 2 != 0 ? "YES" : "NO";
			System.out.println(res);
		}
	}

}
