package com.codechef.math_0_1000;

import java.util.Scanner;

public class Car_Trip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int res = x <= 300 ? 3000 : x * 10;
			System.out.println(res);
		}
	}

}
