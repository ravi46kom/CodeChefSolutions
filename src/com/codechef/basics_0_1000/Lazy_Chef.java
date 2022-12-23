package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Lazy_Chef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int upperB = 0;
		int mult = 0;
		while (t-- > 0) {
			int x = sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();
			upperB = x + d;
			mult = x * m;
			if (mult < upperB) {
				System.out.println(mult);
			} else {
				System.out.println(upperB);
			}

		}

	}

}
