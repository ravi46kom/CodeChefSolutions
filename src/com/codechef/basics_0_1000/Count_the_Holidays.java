package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Count_the_Holidays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // test cases
		String[] week = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		while (t-- > 0) {
			int n = sc.nextInt();
			int count = 8;
			while (n-- > 0) {
				int fest = (sc.nextInt()-1) % 7;
				if (week[fest] != week[5] && week[fest] != week[6]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
