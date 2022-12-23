package com.codechef.basics_0_1000;

import java.util.Scanner;

public class A_Save_Water_Save_Life {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int h = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			if (h*(x + (y / 2)) <= c) {
				System.out.println("yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
