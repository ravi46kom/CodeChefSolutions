package com.codechef.basics_0_1000;

import java.util.Scanner;

public class IPL_Ticket_Rush {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int m = s.nextInt();
			System.out.println(n - m > 0 ? n - m : 0);
		}
	}

}
