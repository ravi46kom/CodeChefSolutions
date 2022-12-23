package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Which_Mixture {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (y == 0) {
				System.out.println("Solid");
			}
			if (x == 0) {
				System.out.println("Liquid");
			} else if (x > 0 && y > 0) {
				System.out.println("Solution");
			}
		}
	}

}
