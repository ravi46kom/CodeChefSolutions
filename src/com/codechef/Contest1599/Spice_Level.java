package com.codechef.Contest1599;

import java.util.Scanner;

public class Spice_Level {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = s.nextInt();
			System.out.println(x >= 7 ? "HOT" : x < 4 ? "MILD" : "MEDIUM");
		}
	}

}
