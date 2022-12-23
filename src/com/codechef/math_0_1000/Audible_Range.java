package com.codechef.math_0_1000;

import java.util.Scanner;

public class Audible_Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int x = sc.nextInt();
			String res = (x >= 67 && x <= 45000) ? "YES" : "NO";
			System.out.println(res);
		}
	}

}
