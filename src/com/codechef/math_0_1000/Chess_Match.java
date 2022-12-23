package com.codechef.math_0_1000;

import java.util.Scanner;

public class Chess_Match {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(2*(180+n)-(a+b));
		}
	}

}
