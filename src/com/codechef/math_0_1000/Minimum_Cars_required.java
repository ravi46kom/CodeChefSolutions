package com.codechef.math_0_1000;

import java.util.Scanner;

public class Minimum_Cars_required {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(n <= 4 ? 1 : (n % 4 == 0 ? n / 4 : (n / 4) + 1));
		}
	}

}
