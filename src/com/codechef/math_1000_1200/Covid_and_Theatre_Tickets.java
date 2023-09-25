package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Covid_and_Theatre_Tickets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int m = s.nextInt();
			int row = n % 2 == 0 ? n / 2 : (n / 2) + 1;
			int seat = m % 2 == 0 ? m / 2 : (m / 2) + 1;
			System.out.println(seat*row);
		}
	}

}
