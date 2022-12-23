package com.codechef.array_1000_1200;

import java.util.Scanner;

public class Mathison_and_pangrams {

	public static void main(String[] args) {
		final int size = 26;
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int[] cost = new int[size];
			for (int i = 0; i < size; i++) {
				cost[i] = s.nextInt();
			}
			String str = s.next();
			int[] freq = new int[size];
			for (int i = 0; i < str.length(); i++) {
				freq[str.charAt(i) - 'a']++;
			}
			int res = 0;
			for (int i = 0; i < size; i++) {
				if (freq[i] == 0) {
					res += cost[i];
				}
			}
			System.out.println(res);
		}
	}

}
