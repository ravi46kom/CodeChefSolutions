package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Easy_Permutation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			do {
				System.out.print(n + " ");
				n--;
			} while (n > 0);
		}
	}

}
