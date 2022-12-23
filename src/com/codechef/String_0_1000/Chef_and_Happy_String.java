package com.codechef.String_0_1000;

import java.util.Scanner;

public class Chef_and_Happy_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String S = sc.next();
			int count = 0;
			for (int i = 0; i < S.length(); i++) {
				if (count == 3) {
					break;
				}
				if (S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o'
						|| S.charAt(i) == 'u') {
					count++;
				} else {
					count = 0;
				}
			}
			if (count == 3) {
				System.out.println("Happy");
			} else {
				System.out.println("Sad");
			}
		}
	}

}
