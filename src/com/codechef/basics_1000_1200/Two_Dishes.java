package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Two_Dishes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			System.out.println(n <= (a + c) && n <= b ? "YES" : "NO");
		}
	}

}
