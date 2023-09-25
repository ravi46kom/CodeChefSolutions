package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Parliament {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			System.out.println((double)s.nextInt() / 2 <= s.nextInt() ? "YES" : "NO");
		}
	}

}
