package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Sign_Moves {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			System.out.println(n % 2 == 0 ? n / 2 : -(n + 1) / 2);
		}
	}

}
