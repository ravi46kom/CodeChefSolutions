package com.codechef.Contest1399;

import java.util.Scanner;

public class Valid_Minimum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int ab = sc.nextInt();
			int bc = sc.nextInt();
			int ca = sc.nextInt();
			int min = Math.min(ab, Math.min(ca, bc));
			System.out.println(
					ab == bc && ab == min || (ca == ab && ab == min) || (bc == ca && bc == min) ? "Yes" : "No");
		}
	}

}