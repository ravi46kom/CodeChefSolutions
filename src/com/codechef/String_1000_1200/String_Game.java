package com.codechef.String_1000_1200;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class String_Game {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str = s.next();
			boolean flag = true;
			HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
			if (n % 2 == 0) {
				for (int i = 0; i < n; i++) {
					if (hs.containsKey(str.charAt(i))) {
						hs.put(str.charAt(i), hs.get(str.charAt(i)) + 1);
					} else {
						hs.put(str.charAt(i), 1);
					}
				}
				for (Map.Entry entry : hs.entrySet()) {
					if ((int) entry.getValue() % 2 == 0) {
						continue;
					} else {
						flag = false;
					}

				}

			}
			System.out.println(n % 2 != 0 || !flag ? "NO" : "YES");

		}
	}

}
