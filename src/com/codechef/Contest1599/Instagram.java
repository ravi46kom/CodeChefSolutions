package com.codechef.Contest1599;

import java.util.Scanner;

public class Instagram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(x > 10 * y ? "YES" : "NO");
		}
	}

}
