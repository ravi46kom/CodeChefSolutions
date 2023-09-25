package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Download_file {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();
		while (tc-- > 0) {
			int n = s.nextInt();
			int k = s.nextInt();
			int res = 0;
			while (n-- > 0) {
				int ti = s.nextInt();
				int di = s.nextInt();
				if (k == 0) {
					res += ti * di;
				} else if (k < ti) {
					ti = ti - k;
					k = 0;
					res += ti * di;
				} else {
					k -= ti;
				}
			}
			System.out.println(res);
		}

	}

}
