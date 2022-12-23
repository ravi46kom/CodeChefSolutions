package com.codechef.math_0_1000;

import java.util.Scanner;

public class Six_Friends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt() * 3;
			int y = sc.nextInt() * 2;
			if (x < y) {
				System.out.println(x);
			} else {
				System.out.println(y);
			}
		}
	}

}
