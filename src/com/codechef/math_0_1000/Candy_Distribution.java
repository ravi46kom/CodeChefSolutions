package com.codechef.math_0_1000;

import java.util.Scanner;

public class Candy_Distribution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int m = s.nextInt();
			String res = n % m == 0 && (n / m) % 2 == 0 ? "Yes" : "No";
			System.out.println(res);
		}
	}

}
