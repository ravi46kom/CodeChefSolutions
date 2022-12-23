package com.codechef.Contest1399;

import java.util.Scanner;

public class Interior_Design {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			System.out.println((x1 + y1) >= (x2 + y2) ? x2 + y2 : x1 + y1);

		}
	}

}
