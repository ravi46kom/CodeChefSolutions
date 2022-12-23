package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Car_Choice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y1 = sc.nextInt();
			int y2 = sc.nextInt();
			float car1 = (float)y1/(float)x1;
			float car2 = (float)y2/(float)x2;
			if (car1 > car2) {
				System.out.println(1);
			} else if (car1 == car2) {
				System.out.println(0);
			} else {
				System.out.println(-1);
			}
		}
	}

}
