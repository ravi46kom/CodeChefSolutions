package com.codechef.Contest1599;

import java.util.Scanner;

public class The_One_Where_It_All_Began {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			System.out.println(n >= 21 ? "YES" : "NO");
		}
	}

}
