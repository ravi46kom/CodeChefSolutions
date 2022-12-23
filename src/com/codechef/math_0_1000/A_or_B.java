package com.codechef.math_0_1000;

import java.util.Scanner;

public class A_or_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println((500 - a * 2) + (1000 - (b + a) * 4) >= (1000 - (b * 4)) + (500 - (a + b) * 2)
					? (500 - a * 2) + (1000 - (b + a) * 4)
					: (1000 - (b * 4)) + (500 - (a + b) * 2));
		}
	}

}
