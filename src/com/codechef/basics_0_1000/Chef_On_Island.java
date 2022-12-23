package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Chef_On_Island {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int _x = sc.nextInt();
			int _y = sc.nextInt();
			int d = sc.nextInt();
			int _x_d = _x * d;
			int _y_d = _y * d;
			if (x >= _x_d && y >= _y_d) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
