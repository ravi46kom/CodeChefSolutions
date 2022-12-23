package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Body_Mass_Index {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int m = sc.nextInt();
			int h = sc.nextInt();
			int bmi = m / (h * h);
			if (m % h == 0) {
				if (bmi <= 18) {
					System.out.println(1);
				} else if (bmi > 18 && bmi < 25) {
					System.out.println(2);
				} else if (bmi > 24 && bmi < 30) {
					System.out.println(3);
				} else {
					System.out.println(4);
				}
			}
		}
	}

}
