package com.codechef.math_0_1000;

import java.util.Scanner;

public class Relativity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int g = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(String.format("%.0f", (Math.pow(c, 2))/(2*g)));
		}
	}
	
}
