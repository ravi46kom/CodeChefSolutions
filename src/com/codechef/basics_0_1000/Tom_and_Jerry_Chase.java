package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Tom_and_Jerry_Chase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(y > x ? "YES" : "NO");
		}
	}

}
