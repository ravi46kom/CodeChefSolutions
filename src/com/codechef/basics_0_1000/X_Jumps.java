package com.codechef.basics_0_1000;

import java.util.Scanner;

public class X_Jumps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x < y || y == 1) {
				System.out.println(x);
			} else {
				int res = x / y + x % y;
				System.out.println(res);
			}
		}
	}

}
