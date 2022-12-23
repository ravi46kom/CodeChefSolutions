package com.codechef.Contest1399;

import java.util.Scanner;

public class MAXTASTE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			System.out.println(Math.max(a + c, Math.max(a + d, Math.max(b + c, b + d))));
		}
	}

}
