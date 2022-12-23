package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Studying_Alphabet {
	static final int size = 26;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] book = new int[size];
		for (int i = 0; i < s.length(); i++) {
			book[s.charAt(i) - 'a'] = 1;
		}
		int t = sc.nextInt();

		while (t-- > 0) {
			boolean flag = true;
		String str1 = sc.next();
		int[] ch = new int[size];
		for (int i = 0; i < str1.length(); i++) {
			ch[str1.charAt(i) - 'a'] = 1;
		}
		for (int i = 0; i < size; i++) {
				if (ch[i] == 1 && book[i] == 0) {
					flag = false;
					break;
				}
			}
			System.out.println(flag?"Yes":"No");
		}
	}

}
