package com.codechef.sorting_0_1000;

import java.util.Scanner;

public class Chef_and_Lockout_Draws {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(a + b == c || a + c == b || b + c == a ? "yes" : "No");
		}
	}

}
