package com.codechef.math_0_1000;

import java.util.Scanner;

public class Equalizing_Numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			String res = Math.abs(a - b) % 2 == 0 ? "Yes" : "No";
			System.out.println(res);
		}
	}

}
