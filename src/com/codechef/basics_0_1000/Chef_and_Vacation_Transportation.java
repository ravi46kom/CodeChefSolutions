package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Chef_and_Vacation_Transportation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			if ((x + y) < z) {
				System.out.println("PLANEBUS");
			} else if ((x + y) == z) {
				System.out.println("EQUAL");
			} else {
				System.out.println("TRAIN");
			}
		}
	}

}
