package com.codechef.String_1000_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Non_Adjacent_Flips {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str = s.next();
			char[] binary = str.toCharArray();
			int count = 0;
			for (int i = 0; i < binary.length; i++) {
				if (binary[i] != '1') {
					continue;
				} else {
					for (int j = i; j < n;) {
						if (binary[j] == '1') {
							binary[j] = '0';
							j += 2;
						} else {
							j++;
						}
					}
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
