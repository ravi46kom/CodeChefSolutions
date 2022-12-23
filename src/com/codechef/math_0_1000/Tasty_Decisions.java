package com.codechef.math_0_1000;

import java.util.Scanner;

public class Tasty_Decisions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			String res = (2*x) > (5*y) ? "Chocolate" : ((2*x) < (5*y)) ? "Candy" : "Either";
			System.out.println(res);
		}
	}

}
