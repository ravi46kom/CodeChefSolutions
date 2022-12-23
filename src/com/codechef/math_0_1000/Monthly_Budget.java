package com.codechef.math_0_1000;

import java.util.Scanner;

public class Monthly_Budget {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt() * 30;
			if (y > x) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}

}
