package com.codechef.basics_0_1000;

import java.util.Scanner;

public class The_Old_Saint_And_Three_Questions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int[] a = new int[3];
			int[] b = new int[3];
			int count1 = 0, count2 = 0;
			for (int i = 0; i < 3; i++) {
				a[i] = sc.nextInt();
				if (a[i] == 1)
					count1++;
			}
			for (int i = 0; i < 3; i++) {
				b[i] = sc.nextInt();
				if (b[i] == 1)
					count2++;
			}
			if (count1 == count2) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");

			}
		}
	}

}
