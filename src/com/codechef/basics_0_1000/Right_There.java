package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Right_There {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int x = s.nextInt();
			System.out.println(n > x ? "NO" : "YES");
		}
	}

}
