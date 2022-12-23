package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Chef_and_Feedback {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String str = s.next();
			boolean flag = false;
			for (int i = 0; i < str.length() - 2; i++) {
				if (str.substring(i, i + 3).equals("101") || str.substring(i, i + 3).equals("010")) {
					flag = true;
					break;
				}
			}
			System.out.println(flag ? "Good" : "Bad");
		}
	}

}
