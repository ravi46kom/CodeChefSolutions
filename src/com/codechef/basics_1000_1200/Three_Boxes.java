package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Three_Boxes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			int sum = a + b + c;
			System.out.println(sum <= d ? 1 : ((a + b) <= d || (b + c) <= d) ? 2 : 3);
		}
//		System.out.println((2 * Math.sqrt(392) - 21) + Math.pow((Math.sqrt(8) - 7), 2));
	}

}
