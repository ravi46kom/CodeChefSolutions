package com.codechef.array_0_1000;

import java.util.Scanner;

public class Good_Turn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			System.out.println(s.nextInt() + s.nextInt() > 6 ? "YES" : "NO");
		}
	}

}
