package com.codechef.array_1000_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Lapindromes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String str = s.next();
			int len = str.length() / 2;
			String first = str.substring(0, len);
			char[] ch1 = first.toCharArray();
			Arrays.sort(ch1);
			String second = "";
			if (str.length() % 2 == 0) {
				second = str.substring(len, str.length());
			} else {
				second = str.substring(len + 1, str.length());
			}
			char[] ch2 = second.toCharArray();
			Arrays.sort(ch2);
			System.out.println(String.valueOf(ch2).equals(String.valueOf(ch1)) ? "YES" : "NO");

		}
	}

}
