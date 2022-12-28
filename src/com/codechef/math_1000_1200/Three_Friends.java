package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Three_Friends {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			int z = s.nextInt();
			System.out.println((x + y == z) || (x + z == y) || (y + z == x) ? "yes" : "no");
		}
	}

}
