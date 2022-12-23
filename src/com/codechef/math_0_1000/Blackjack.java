package com.codechef.math_0_1000;

import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(21 - (a + b) > 0 && 21 - (a + b) <= 10 ? 21 - (a + b) : -1);

		}
	}

}
