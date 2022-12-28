package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Kitchen_Timings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(Math.abs(x - y));
		}
	}

}
