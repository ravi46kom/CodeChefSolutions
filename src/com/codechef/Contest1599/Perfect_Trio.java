package com.codechef.Contest1599;

import java.util.Scanner;

public class Perfect_Trio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			System.out.println((a + b) == c || (b + c) == a || (a + c) == b ? "YES" : "NO");
		}
	}

}
