package com.codechef.math_0_1000;

import java.util.Scanner;

public class Determine_the_Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int n = sc.nextInt();
			System.out.println((x / 10) * n);
		}
	}

}
