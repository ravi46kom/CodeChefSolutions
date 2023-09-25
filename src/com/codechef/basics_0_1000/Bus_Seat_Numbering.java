package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Bus_Seat_Numbering {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			System.out.println(
					n < 11 ? "Lower Double" : n < 16 ? "Lower Single" : n < 26 ? "Upper Double" : "Upper Single");
		}
	}

}
