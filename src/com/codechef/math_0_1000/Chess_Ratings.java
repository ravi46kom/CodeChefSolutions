package com.codechef.math_0_1000;

import java.util.Scanner;

public class Chess_Ratings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int count = 0;
			if (x >= y) {
				System.out.println(0);
			} else {
				while (x < y) {
					x += 8;
					count++;
				}
				System.out.println(count);
			}
		}
	}

}
