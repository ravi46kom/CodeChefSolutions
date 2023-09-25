package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Stick_Break {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int l = s.nextInt();
			int k = s.nextInt();
			System.out.println(l % k == 0 ? 0 : 1);
		}
	}

}
