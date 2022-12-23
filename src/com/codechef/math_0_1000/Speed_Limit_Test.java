package com.codechef.math_0_1000;

import java.util.Scanner;

public class Speed_Limit_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int x = s.nextInt();
			int b = s.nextInt();
			int y = s.nextInt();
			double aliceSpeed = (double) a / x;
			double bobSpeed = (double) b / y;
			String res = aliceSpeed < bobSpeed ? "Bob" : aliceSpeed > bobSpeed ? "Alice" : "Equal";
			System.out.println(res);
		}
	}

}
