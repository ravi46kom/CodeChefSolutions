package com.codechef.array_0_1000;

import java.util.Scanner;

public class Recent_contest_problems {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String[] arr = new String[n];
			int START_38 = 0, LTIME_108 = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.next();
				if (arr[i].equals("START38")) {
					START_38++;
				} else if (arr[i].equals("LTIME108")) {
					LTIME_108++;
				}
			}
			System.out.println(START_38 + " " + LTIME_108);
		}
	}

}
