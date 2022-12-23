package com.codechef.Contest1599;

import java.util.Arrays;
import java.util.Scanner;

public class Maximise_XOR {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			while (t-- > 0) {
				String a = s.next();
				String b = s.next();
				int len = a.length();
				int countOne = 0;
				int countZero = 0;
				for (int i = 0; i < len; i++) {
					if (a.charAt(i) == '1') {
						countOne++;
					} else {
						countZero++;
					}
					if (b.charAt(i) == '1') {
						countOne++;
					} else {
						countZero++;
					}
	
				}
				StringBuilder result = new StringBuilder();
				int min = Math.min(countZero, countOne);
				for (int i = 0; i < min; i++) {
					result.append('1');
				}
				for (int i = min; i < a.length(); i++) {
					result.append('0');
				}
				System.out.println(result);
			}

	}

}
