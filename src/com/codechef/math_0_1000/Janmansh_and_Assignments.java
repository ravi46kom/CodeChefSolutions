package com.codechef.math_0_1000;

import java.util.Scanner;

public class Janmansh_and_Assignments {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt() + 3;
			if (x > 10) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}

}
