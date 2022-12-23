package com.codechef.String_1000_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Snake_Procession {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int l = s.nextInt();
			String str = s.next();
			String res = "";
			boolean flag = true;
			for (int i = 0; i < l; i++) {
				if (str.charAt(i) == 'H' || str.charAt(i) == 'T') {
					res += str.charAt(i);
				}
			}
			for (int i = 0; i < res.length(); i++) {
				if (res.charAt(0) == 'T' || res.charAt(res.length() - 1) == 'H') {
					flag = false;
					break;
				}
				if (i % 2 == 0 && res.charAt(i) != 'H' || i % 2 != 0 && res.charAt(i) != 'T') {
					flag = false;
					break;
				}
			}
			System.out.println(flag ? "Valid" : "Invalid");
		}
	}

}
