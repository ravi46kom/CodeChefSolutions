package com.codechef.math_0_1000;

import java.util.Scanner;

public class Avoid_Squares_Please {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			for (int i = 1; i <= n; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
