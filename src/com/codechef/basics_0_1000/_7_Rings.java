package com.codechef.basics_0_1000;

import java.util.Scanner;

public class _7_Rings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String digits = String.valueOf((s.nextInt() * s.nextInt()));
			System.out.println(digits.length() != 5 ? "NO" : "YES");
		}
	}

}
