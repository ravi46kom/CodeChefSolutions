package com.codechef.math_0_1000;

import java.util.Scanner;

public class Monopoly_in_Chefland {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int r1 = sc.nextInt();
			int r2 = sc.nextInt();
			int r3 = sc.nextInt();
			String result = (r1+r2 < r3) ? "Yes":(r2+r3<r1) ? "Yes":(r1+r3<r2) ? "Yes":"No";
			System.out.println(result);
		}
	}

}
