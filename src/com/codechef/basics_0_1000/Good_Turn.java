package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Good_Turn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(x + y > 6 ? "YES" : "NO");
		}
	}

}
