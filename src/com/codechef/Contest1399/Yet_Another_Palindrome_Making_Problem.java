package com.codechef.Contest1399;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Yet_Another_Palindrome_Making_Problem {
	static char[] swap(String str, int i, int j) {
		char ch[] = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return ch;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String str = sc.next().toLowerCase();
			String rev1 = "";
			ArrayList<Character> ar1 = new ArrayList<Character>();
			ArrayList<Character> ar2 = new ArrayList<Character>();
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					ar1.add(str.charAt(i));
				} else {
					ar2.add(str.charAt(i));
				}
			}
			Collections.sort(ar1);
			Collections.sort(ar2);
			if (ar1.equals(ar2)) {
				System.out.println("yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
