package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Processing_a_string {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String str = s.next();
			int sum = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
					sum += (int) str.charAt(i) - '0';
				}
			}
			System.out.println(sum);
		}
	}

}
