package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Break_the_Stick {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = s.nextInt();
			int n = s.nextInt();
			System.out.println(x % 2 == 0 ? "Yes" : n % 2 == 0 ? "No" : "Yes");
		}
	}

}
