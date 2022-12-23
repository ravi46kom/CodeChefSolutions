package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Alternating_String {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str = s.next();
			int zero = 0;
			int one = 0;
			for (int i = 0; i < n; i++) {
				if (str.charAt(i) == '0') {
					zero++;
				} else {
					one++;
				}
			}
			if (n == 1 || n == 2 && (one == 2 || zero == 2)) {
				System.out.println(1);
			} else if (n == 2 && one == 1) {
				System.out.println(n);
			} else if (one == zero) {
				System.out.println(Math.min(one, zero) + Math.min(one, zero));
			} else {
				System.out.println(Math.min(one, zero) + Math.min(one, zero) + 1);
			}
		}
	}

}
