package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Cricket_Ranking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int r_1 = sc.nextInt();
			int w_1 = sc.nextInt();
			int c_1 = sc.nextInt();
			int r_2 = sc.nextInt();
			int w_2 = sc.nextInt();
			int c_2 = sc.nextInt();
			int count_1 = 0;
			int count_2 = 0;
			if (r_1 > r_2)
				count_1++;
			else
				count_2++;

			if (w_1 > w_2)
				count_1++;
			else
				count_2++;

			if (c_1 > c_2)
				count_1++;
			else
				count_2++;

			if (count_1 > count_2)
				System.out.println("A");
			else
				System.out.println("B");
		}
	}

}
