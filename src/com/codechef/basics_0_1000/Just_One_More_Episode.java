package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Just_One_More_Episode {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = s.nextInt();
			System.out.println(x > 24 ? "YES" : "NO");
		}
	}

}
