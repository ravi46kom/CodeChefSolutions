package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Little_Elephant_and_Strings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int n = s.nextInt();
		String[] luckyNum = new String[k];
		for (int i = 0; i < k; i++) {
			luckyNum[i] = s.next();
		}
		while (n-- > 0) {
			String str = s.next();
			boolean flag = false;
			if (str.length() >= 47) {
				flag = true;
			} else {
				for (int i = 0; i < k; i++) {
					if (str.contains(luckyNum[i])) {
						flag = true;
						break;
					}
				}
			}

			System.out.println(flag ? "Good" : "Bad");
		}
	}

}
