package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Battery_Health {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = s.nextInt();
			System.out.println(x >= 80 ? "YES" : "NO");
		}
	}

}
