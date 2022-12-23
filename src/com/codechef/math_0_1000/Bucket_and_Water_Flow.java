package com.codechef.math_0_1000;

import java.util.Scanner;

public class Bucket_and_Water_Flow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int w = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int total_water = w + y * z;
			if (total_water == x) {
				System.out.println("FIlled");
			} else if (total_water > x) {
				System.out.println("overflow");
			} else {
				System.out.println("unfilled");
			}
		}
	}

}
