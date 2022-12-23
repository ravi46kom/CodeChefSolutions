package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Chef_and_Spells {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
//			System.out.println(Math.max(a + b, Math.max(b + c, a + c)));
			int min = a;
			if (b < min && b < c) {
				min = b;
			} else if (c < min) {
				min = c;
			}
			System.out.println(a + b + c - min);

		}
	}

}
