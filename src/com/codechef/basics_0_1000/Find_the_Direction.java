package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Find_the_Direction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int ang = 0;
			for (int i = 0; i < x; i++) {
				ang += 90;
				if (ang == 360) {
					ang = 0;
				}
			}
			if (ang == 0) {
				System.out.println("North");
			} else if (ang == 90) {
				System.out.println("East");
			} else if (ang == 180) {
				System.out.println("South");
			} else {
				System.out.println("West");
			}
		}
	}

}
