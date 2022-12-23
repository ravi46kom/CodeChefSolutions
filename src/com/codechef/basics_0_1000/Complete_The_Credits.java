package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Complete_The_Credits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int X = sc.nextInt();
			if (X > 65) {
				System.out.println("OVERLOAD");
			} else if (X < 35) {
				System.out.println("Underload");
			} else {
				System.out.println("Normal");
			}
		}
	}

}
