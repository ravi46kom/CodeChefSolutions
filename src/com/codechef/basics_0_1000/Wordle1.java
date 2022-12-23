package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Wordle1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String S = sc.next();
			String T = sc.next();
			String M = "";
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) == T.charAt(i)) {
					M += "G";
				} else {
					M += "B";
				}
			}
			System.out.println(M);
		}

	}

}
