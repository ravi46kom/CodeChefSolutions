package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Olympics_Ranking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int g_1 = sc.nextInt();
			int s_1 = sc.nextInt();
			int b_1 = sc.nextInt();
			int g_2 = sc.nextInt();
			int s_2 = sc.nextInt();
			int b_2 = sc.nextInt();
			if ((g_1 + s_1 + b_1) > (g_2 + s_2 + b_2)) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
		}
	}

}
