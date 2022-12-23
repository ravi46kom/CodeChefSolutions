package com.codechef.Contest1599;

import java.util.Scanner;

public class Prime_Reversal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str1 = s.next();
			String str2 = s.next();
			int str1_countOne = 0;
			int str2_count = 0;
			for (int i = 0; i < n; i++) {
				if (str1.charAt(i) == '1') {
					str1_countOne++;
				}
				if (str2.charAt(i) == '1') {
					str2_count++;
				}
			}
			if (str1_countOne == str2_count) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
