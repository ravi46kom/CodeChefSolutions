package com.codechef.math_0_1000;

import java.util.Scanner;

public class Multivitamin_Tablets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(x * 3 <= y ? "YES" : "NO");
		}
	}

}
