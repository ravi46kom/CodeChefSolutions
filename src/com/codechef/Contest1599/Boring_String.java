package com.codechef.Contest1599;

import java.util.Scanner;

public class Boring_String {
	static int Freq(String str) {
		int n = str.length();
		int res = 0;
		int[] freq = new int[26];

		for (int i = 0; i < n; i++)
			freq[str.charAt(i) - 'a']++;

		for (int i = 0; i < n; i++) {

			if (freq[str.charAt(i) - 'a'] != 0) {
				res = Math.max(res, freq[str.charAt(i) - 'a']);
				freq[str.charAt(i) - 'a'] = 0;
			}
		}
		return res;
	}

	static int Substring(String s) {
		int ans = 1, temp = 1;
		int count = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				++temp;
			} else {
				ans = Math.max(ans, temp);
				temp = 1;
			}
		}
		ans = Math.max(ans, temp);
		if (ans == 1 && Freq(s)  == 1) {
			ans = 0;
		}
		if(ans == s.length()) {
			ans -= 1;
		}

		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str = s.next();
			String result = "";

			System.out.println(Substring(str));
		}
	}

}
