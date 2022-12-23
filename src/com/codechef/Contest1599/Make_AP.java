package com.codechef.Contest1599;

import java.util.Scanner;

public class Make_AP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int c = s.nextInt();
			int b = a + c;
			System.out.println(b % 2 == 0 ? b / 2 : -1);

		}
	}

}
