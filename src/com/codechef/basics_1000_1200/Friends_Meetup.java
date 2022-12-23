package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Friends_Meetup {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x1 = s.nextInt();
			int x2 = s.nextInt();
			System.out.println((x1 >= x2) ? "Yes" : "No");
		}
	}

}
