package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Xor_Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String a = s.next();
			int count = 0;
			for (int i = 0; i < n / 2; i++) {
				if (a.charAt(i) != a.charAt(n - i - 1) ) {
					count++;
				}
			}
			System.out.println(count%2 == 0?count/2:(count/2)+1);

		}
	}

}
