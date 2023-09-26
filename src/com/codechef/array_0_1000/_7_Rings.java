package com.codechef.array_0_1000;

import java.util.Scanner;

public class _7_Rings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t --> 0) {
			int n = s.nextInt();
			int x = s.nextInt();
			String result = Integer.toString(n*x);
			System.out.println(result.length() == 5 && result.charAt(0) != '0' ? "YES" : "NO");
		}
	}

}
