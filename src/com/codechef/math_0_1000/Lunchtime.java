package com.codechef.math_0_1000;

import java.util.Scanner;

public class Lunchtime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			if (x > 0 && x < 5) {
				System.out.println("yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
