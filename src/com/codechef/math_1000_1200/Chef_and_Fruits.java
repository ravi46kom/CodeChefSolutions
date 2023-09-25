package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Chef_and_Fruits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int m = s.nextInt();
			int k = s.nextInt();
			System.out.println(Math.abs(m - n) - k <= 0 ? 0 : Math.abs(m - n) - k);
		}
	}

}
