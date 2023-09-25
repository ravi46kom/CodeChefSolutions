package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Binary_String_Cost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			sc.nextLine();
			int count1 = 0;
			int count2 = 0;
			String s = sc.next();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '0') {
					count1++;
				}
				if (s.charAt(i) == '1') {
					count2++;
				}
			}
			System.out.println((count1 == 0 || count2 == 0) ? 0 : (x >= y) ? y : x);
		}
	}

	

}
