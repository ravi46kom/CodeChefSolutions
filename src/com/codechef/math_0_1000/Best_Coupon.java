package com.codechef.math_0_1000;

import java.util.Scanner;

public class Best_Coupon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			if (x > 1000) {
				System.out.println((x * 10) / 100);
			} else {
				System.out.println(100);
			}
		}
	}

}
