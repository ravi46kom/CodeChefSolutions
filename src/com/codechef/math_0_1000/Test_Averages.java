package com.codechef.math_0_1000;

import java.util.Scanner;

public class Test_Averages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			String res = ((a + b) / 2 < 35) || ((a + c) / 2 < 35) || ((c + b) / 2 < 35) ? "Fail" : "Pass";
			System.out.println(res);
		}
	}

}
