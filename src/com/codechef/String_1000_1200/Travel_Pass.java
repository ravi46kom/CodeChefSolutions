package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Travel_Pass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int a = s.nextInt();
			int b = s.nextInt();
			String str = s.next();
			int countZero = 0;
			for (int i = 0; i < n; i++) {
				if (str.charAt(i) == '0') {
					countZero++;
				}
			}
			int countOne = n - countZero;
			System.out.println((countOne * b) + (countZero * a));
		}
	}

}
