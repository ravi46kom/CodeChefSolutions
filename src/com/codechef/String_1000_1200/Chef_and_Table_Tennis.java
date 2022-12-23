package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Chef_and_Table_Tennis {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String score = s.next();
			int countOne = 0;
			int countZero = 0;
			for (int i = 0; i < score.length(); i++) {
				if (score.charAt(i) == '0') {
					countZero++;
				} else {
					countOne++;
				}

			}
			System.out.println(countOne >= countZero ? "WIN" : "LOSE");
		}
	}

}
