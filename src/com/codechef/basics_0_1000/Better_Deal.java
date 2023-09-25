package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Better_Deal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t --> 0) {
			int a = 100 - s.nextInt();
			int b = 200 - 2*s.nextInt();
			System.out.println( a>b ? "SECOND":a<b?"FIRST":"BOTH");
		}
	}

}
