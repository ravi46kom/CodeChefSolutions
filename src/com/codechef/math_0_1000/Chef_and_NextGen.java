package com.codechef.math_0_1000;

import java.util.Scanner;

public class Chef_and_NextGen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if ((a * b) > (x * y)) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}

}
