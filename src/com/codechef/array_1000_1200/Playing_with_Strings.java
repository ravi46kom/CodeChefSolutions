package com.codechef.array_1000_1200;

import java.util.Scanner;

public class Playing_with_Strings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str = s.next();
			String r = s.next();
			int count = 0;
			for (int i = 0; i < r.length(); i++) {
				count += str.charAt(i);
				count -= r.charAt(i);
			}
			System.out.println(count == 0 ? "YES" : "NO");
		}

	}

}
