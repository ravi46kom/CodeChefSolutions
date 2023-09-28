package com.codechef.array_0_1000;

import java.util.Scanner;

public class Chef_On_Date {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(x >= y ? "YES" : "NO");
		}
	}

}
